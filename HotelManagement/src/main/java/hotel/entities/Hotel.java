package hotel.entities;

import java.util.List;
import java.util.UUID;

public class Hotel {
    String name;
    Integer hotelId;//or UUID
    Location hotelLocation;
    List<Room> roomList;

}
