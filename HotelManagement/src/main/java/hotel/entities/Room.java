package hotel.entities;

import hotel.constants.RoomStatus;
import hotel.constants.RoomStyle;

import java.util.List;

public class Room {

    String roomNumber;
    RoomStyle roomStyle;
    RoomStatus roomStatus;
    Double bookingPrice;
    List<RoomKey> roomKeys;
    List<HouseKeepingLogs> houseKeepingLogs;

}
