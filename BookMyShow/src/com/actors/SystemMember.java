package com.actors;

import com.constants.Address;
import com.search.Search;

public class SystemMember extends User {
    String name;
    Address address;
    String email;
    long phone;
    Account account;

    public SystemMember() {
    }

    public SystemMember(String name, Address address, String email, long phone, Account account) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.account = account;
    }
}
