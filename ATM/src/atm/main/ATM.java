package atm.main;

import atm.actors.Customer;
import atm.components.*;
import atm.constants.Address;
import atm.entity.Bank;
import atm.entity.CardInfo;
import atm.service.BankService;
import atm.service.BankServiceFactory;
import atm.transaction.CashDeposit;
import atm.transaction.ChequeDeposit;
import atm.transaction.Transaction;

import java.util.Currency;

public class ATM {
    int atmId;

    Address location;

    CardReader cardReader;
    CashDispenser cashDispenser;
    Screen screen;
    Keypad keypad;
    Printer printer;
    CashDeposit cashDeposit;
    ChequeDeposit chequeDeposit;

    //BankService bankService;


    public void authenticateUser(Customer customer){

    }

    public void makeTransaction(CardInfo cardInfo, Transaction transactionInfo, Customer customer){
        Bank bank = fetchBankFromCardInfo(cardInfo);
        BankService bankService = BankServiceFactory.getBankServiceObject(bank);
        bankService.executeTransaction(transactionInfo, customer);
    }

    private Bank fetchBankFromCardInfo(CardInfo cardInfo){
        return new Bank();
    }

}
