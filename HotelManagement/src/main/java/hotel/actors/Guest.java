package hotel.actors;

import hotel.booking.Booking;
import hotel.booking.RoomBooking;
import hotel.search.Search;

import java.util.List;

public class Guest extends Person{
    Search search;
    Booking booking;

    public List<RoomBooking> getAllRoomBookings(){
        return null;
    }
}
