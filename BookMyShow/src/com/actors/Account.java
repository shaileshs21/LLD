package com.actors;

import com.constants.AccountStatus;

public class Account {
    String userId;
    String password;
    AccountStatus accountStatus;

    public Account(String userId, String password){
        this.userId = userId;
        this.password = password;
        this.accountStatus = AccountStatus.ACTIVE;
    }
}
