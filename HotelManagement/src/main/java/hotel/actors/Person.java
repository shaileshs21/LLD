package hotel.actors;

import hotel.account.Account;
import hotel.constants.AccountStatus;

public abstract class Person {
    String name;
    Account accountDetails;
    String phone;
    AccountStatus accountStatus;
}
