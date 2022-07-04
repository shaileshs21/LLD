package atm.entity;

import atm.constants.CardtType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CardInfo {
    CardtType cardtType;
    Bank bank;
    String cardNumber;
    Date expiryDate;
    int cvv;
    float withdrawlLimit;

    public List<Integer> dummyMethod(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(90,100));
        return list;
    }
}
