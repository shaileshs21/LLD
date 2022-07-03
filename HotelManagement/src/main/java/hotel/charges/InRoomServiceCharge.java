package hotel.charges;

public class InRoomServiceCharge implements BaseRoomCharge{
    Double costOfInRoomPurchase;
    BaseRoomCharge baseRoomCharge;

    @Override
    public Double getCost() {
        baseRoomCharge.setCost(costOfInRoomPurchase + baseRoomCharge.getCost());
        return baseRoomCharge.getCost();
    }

    @Override
    public void setCost(Double cost) {
        this.costOfInRoomPurchase = cost;
    }
}
