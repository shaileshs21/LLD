package atm.service;

import atm.actors.Customer;
import atm.entity.CardInfo;
import atm.transaction.Transaction;
import atm.transaction.TransactionDetail;

public class BankB implements BankService{
    @Override
    public boolean isValidUser(String pin, CardInfo cardInfo) {
        return false;
    }

    @Override
    public Customer getCustomerDetails(CardInfo cardInfo) {
        return null;
    }

    @Override
    public TransactionDetail executeTransaction(Transaction transactionInfo, Customer customer) {
        return null;
    }
}
