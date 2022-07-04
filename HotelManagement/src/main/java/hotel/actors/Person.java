package hotel.actors;

import hotel.account.Account;
import hotel.constants.AccountStatus;

import javax.persistence.MappedSuperclass;

//@MappedSuperclass
public abstract class Person {

    String name;
    Account accountDetails;
    String phone;
    AccountStatus accountStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(Account accountDetails) {
        this.accountDetails = accountDetails;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }
}
