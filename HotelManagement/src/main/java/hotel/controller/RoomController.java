package hotel.controller;

import hotel.actors.Person;
import hotel.constants.RoomCategory;
import hotel.entities.Room;
import hotel.services.BookingService;
import hotel.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @Autowired
    private BookingService bookingService;

    @RequestMapping(method = RequestMethod.GET, value = "room/available")
    private List<Room> getAvailableRooms(){
        return roomService.getAvailableRooms();
    }

    @RequestMapping("/findAllRooms")
    private List<Room> getAllRoom() {
        return roomService.getAllRooms();
    }

    @RequestMapping("find/category/{name}")
    private List<Room> findByCategoryName(@PathVariable("name")RoomCategory category){
        return roomService.getByCategoryName(category);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/room/book")
    public Room bookRoom(
            @RequestParam("userId")Person person,
            @RequestParam("year") int year,
            @RequestParam("month") int month,
            @RequestParam("dayOfMonth") int dayOfMonth
            ){
        return new Room();
    }

}
