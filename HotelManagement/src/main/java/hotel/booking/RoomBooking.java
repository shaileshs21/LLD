package hotel.booking;

import hotel.actors.Guest;
import hotel.constants.BookingStatus;
import hotel.entities.Room;

import java.util.Date;
import java.util.List;

public class RoomBooking {
    String bookingId;
    Date startDate;
    int durationInDays;
    BookingStatus bookingStatus;
    List<Guest> guestList;
    List<Room> roomList;
    BookingStatus totalRoomChanrges;
}
