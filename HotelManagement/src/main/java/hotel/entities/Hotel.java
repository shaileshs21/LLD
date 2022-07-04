package hotel.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "Name")
    String name;

    @OneToOne
    @JoinColumn(name = "locationId")
    Location hotelLocation;

    @Transient
    List<Room> roomList;

    public Hotel(Long id, String name, Location hotelLocation) {
        this.id = id;
        this.name = name;
        this.hotelLocation = hotelLocation;
    }

    public Hotel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(Location hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
}
