package atm.service;

import atm.actors.Customer;
import atm.entity.CardInfo;
import atm.transaction.Transaction;
import atm.transaction.TransactionDetail;

public interface BankService {
    boolean isValidUser(String pin, CardInfo cardInfo);
    Customer getCustomerDetails(CardInfo cardInfo);
    TransactionDetail executeTransaction(Transaction transactionInfo, Customer customer);
}
