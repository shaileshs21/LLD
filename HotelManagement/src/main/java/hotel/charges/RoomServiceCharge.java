package hotel.charges;

//Decorator pattern

public class RoomServiceCharge implements BaseRoomCharge{

    Double costOfRoomService;
    BaseRoomCharge baseRoomCharge;

    @Override
    public Double getCost() {
        baseRoomCharge.setCost(costOfRoomService + baseRoomCharge.getCost());
        return baseRoomCharge.getCost();
    }

    @Override
    public void setCost(Double cost) {
        this.costOfRoomService = cost;
    }
}
