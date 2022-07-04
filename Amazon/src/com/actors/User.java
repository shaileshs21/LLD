package com.actors;

import com.account.Account;

//already member of Amazon
public class User {
    Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
