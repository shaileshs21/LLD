package atm.transaction;

import atm.constants.TransactionStaus;
import atm.constants.TransactionType;

import java.util.Date;

public class TransactionDetail {
    TransactionType transactionType;
    TransactionStaus transactionStaus;
    Date transactionDate;
    String sourceAccountNumber;
    int transactionId;
}
