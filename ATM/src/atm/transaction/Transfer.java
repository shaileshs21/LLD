package atm.transaction;

import atm.entity.account.Account;

public class Transfer extends Transaction{
    Account destAccount;
    float amount;
}
