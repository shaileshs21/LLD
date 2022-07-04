package hotel.entities;

import hotel.constants.RoomStatus;
import hotel.constants.RoomCategory;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ROOM_NUMBER")
    String roomNumber;

    @Column(name = "CATEGORY")
    RoomCategory roomCategory;

    @Column(name = "STATUS")
    RoomStatus roomStatus;

    @Column(name = "PRICE")
    Double bookingPrice;
    @Transient
    List<RoomKey> roomKeys;

    @Transient
    List<HouseKeepingLogs> houseKeepingLogs;

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomCategory getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(RoomCategory roomCategory) {
        this.roomCategory = roomCategory;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    public Double getBookingPrice() {
        return bookingPrice;
    }

    public void setBookingPrice(Double bookingPrice) {
        this.bookingPrice = bookingPrice;
    }

    public List<RoomKey> getRoomKeys() {
        return roomKeys;
    }

    public void setRoomKeys(List<RoomKey> roomKeys) {
        this.roomKeys = roomKeys;
    }

    public List<HouseKeepingLogs> getHouseKeepingLogs() {
        return houseKeepingLogs;
    }

    public void setHouseKeepingLogs(List<HouseKeepingLogs> houseKeepingLogs) {
        this.houseKeepingLogs = houseKeepingLogs;
    }
}
