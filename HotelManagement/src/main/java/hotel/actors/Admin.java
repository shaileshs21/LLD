package hotel.actors;

import hotel.entities.Room;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Embeddable
//@Table(name = "Admin")
public class Admin extends Person{
    public void addRoom(Room room){
    }

    public void editRoom(Room room){
    }

    public void deleteRoom(Room room){
    }
}
