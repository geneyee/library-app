package com.group.libraryapp.domain.user.loanhistory;

import com.group.libraryapp.domain.user.User;

import javax.persistence.*;

@Entity
public class UserLoanHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @ManyToOne//N:1 한 사람이 여러 대출기록을 가지고 있음
    private User user;

    @Column
    private String bookName;

    @Column
    private boolean isReturn;

    protected UserLoanHistory() {
    }

    public UserLoanHistory(User user, String bookName) {
        this.user = user;
        this.bookName = bookName;
        this.isReturn = false;//대출중
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getBookName() {
        return bookName;
    }

    public boolean isReturn() {
        return isReturn;
    }

    public void doReturn(){
        this.isReturn=true;
    }
}
