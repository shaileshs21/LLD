package atm.entity;

import atm.constants.Address;
import atm.main.ATM;
import atm.service.BankService;

import java.util.List;

public class Bank {
    String name;
    Address address;
    List<ATM> atmList;
    BankService bankService;
}
