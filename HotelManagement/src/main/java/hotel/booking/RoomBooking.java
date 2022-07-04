package hotel.booking;

import hotel.actors.Guest;
import hotel.actors.Person;
import hotel.constants.BookingStatus;
import hotel.entities.Room;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "booking")
public class RoomBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long bookingId;

    @Column(name = "date_from")
    private LocalDate date_from;

    @Column(name = "date_to")
    private LocalDate date_to;

    @Column(name = "total_days")
    int durationInDays;

    @Transient
    private Person person;

    @Transient
    BookingStatus bookingStatus;

    @Transient
    List<Guest> guestList;

    @Transient
    List<Room> roomList;

    @Transient
    BookingStatus totalRoomChanrges;

    public RoomBooking(Long bookingId, LocalDate date_from, LocalDate date_to, int durationInDays, Person person, BookingStatus bookingStatus, List<Guest> guestList, List<Room> roomList, BookingStatus totalRoomChanrges) {
        this.bookingId = bookingId;
        this.date_from = date_from;
        this.date_to = date_to;
        this.durationInDays = durationInDays;
        this.person = person;
        this.bookingStatus = bookingStatus;
        this.guestList = guestList;
        this.roomList = roomList;
        this.totalRoomChanrges = totalRoomChanrges;
    }

    public RoomBooking() {
    }

    public Long getBookingId() {
        return bookingId;
    }


    public LocalDate getDate_from() {
        return date_from;
    }

    public void setDate_from(LocalDate date_from) {
        this.date_from = date_from;
    }

    public LocalDate getDate_to() {
        return date_to;
    }

    public void setDate_to(LocalDate date_to) {
        this.date_to = date_to;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public BookingStatus getTotalRoomChanrges() {
        return totalRoomChanrges;
    }

    public void setTotalRoomChanrges(BookingStatus totalRoomChanrges) {
        this.totalRoomChanrges = totalRoomChanrges;
    }
}
