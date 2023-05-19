package com.group.libraryapp.domain.user.loanhistory;

import javax.persistence.*;

@Entity
public class UserLoanHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column
    private Long userId;

    @Column
    private String bookName;

    @Column
    private boolean isReturn;

    protected UserLoanHistory() {
    }

    public UserLoanHistory(Long userId, String bookName) {
        this.userId = userId;
        this.bookName = bookName;
        this.isReturn = false;//대출중
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
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
