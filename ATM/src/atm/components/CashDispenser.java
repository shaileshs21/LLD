package atm.components;

import atm.constants.CashType;
import atm.entity.Cash;

import java.util.List;
import java.util.Map;

public class CashDispenser {
    Map<CashType, List<Cash>> cashAvailable;

    public void dispenseCash(int amount){

    }

    public boolean canDispenseCash(){
        return true;
    }
}
