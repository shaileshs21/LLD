package hotel.services;

import hotel.constants.RoomCategory;
import hotel.constants.RoomStatus;
import hotel.entities.Room;
import hotel.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAvailableRooms() {
        return availableRooms();
    }

    private List<Room> availableRooms() {
        List<Room> result = new ArrayList<>();
        for (Room room : roomRepository.findAll()) {
            if (room.getRoomStatus() == RoomStatus.AVAILABLE) {
                result.add(room);
            }
        }
        return result;
    }

    public List<Room> getByCategoryName(RoomCategory category) {
        List<Room> rooms = filterByCategory(category);
        return rooms;
    }

    private List<Room> filterByCategory(RoomCategory category) {
        return roomRepository.findAll().
                stream().
                filter(room -> room.getRoomCategory() == category).
                collect(Collectors.toList());
    }


    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
