package atm.actors;

import atm.constants.CustomerStatus;
import atm.entity.account.Account;
import atm.entity.CardInfo;
import atm.service.BankService;

public class Customer {
    String firstName;
    String lastName;
    CardInfo cardInfo;
    Account account;

    BankService bankService;
    CustomerStatus customerStatus;

    public void makeTransaction(){

    }

    public String getBillingAddress(){
        return "";
    }
}
