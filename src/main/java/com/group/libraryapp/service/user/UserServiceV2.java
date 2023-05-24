package com.group.libraryapp.service.user;

import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.domain.user.UserRepository;
import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserServiceV2 {

    private final UserRepository userRepository;

    @Transactional
    public void saveUser(UserCreateRequest request){
        userRepository.save(new User(request.getName(), request.getAge()));
    }

    @Transactional(readOnly = true)
    public List<UserResponse> getUsers(){
        //List<User> users = userRepository.findAll();
/*        return userRepository.findAll().stream()
                .map(user -> new UserResponse(user.getId(), user.getName(), user.getAge()))
                .collect(Collectors.toList());*/

        return userRepository.findAll().stream()
                .map(UserResponse::new)
                .collect(Collectors.toList());
    }//UserResponse::new UserResponse에서 User user매개변수로 생성자 만든거

    @Transactional
    public void updateUser(UserUpdateRequest request) {
        //select * from user where id = ?
        //Optional<User>
        User user = userRepository.findById(request.getId())
                .orElseThrow(IllegalArgumentException::new);

        user.updateName(request.getName());
//        userRepository.save(user);
    }

    @Transactional
    public void deleteUser(String name){

        //select * from user where name = ?
       User user = userRepository.findByName(name)
               .orElseThrow(IllegalArgumentException::new);

       userRepository.delete(user);

/*
        boolean existsByName(String name);사용할 경우

        if(!userRepository.existsByName(name)){
           throw new IllegalArgumentException();
       }
*/


       }
    }

