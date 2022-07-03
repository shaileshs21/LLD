package hotel.charges;

public class RoomCharge implements BaseRoomCharge{

    Double cost;

    @Override
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
