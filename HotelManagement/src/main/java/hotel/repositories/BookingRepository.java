package hotel.repositories;

import hotel.actors.Person;
import hotel.booking.RoomBooking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<RoomBooking, Long> {
    //List<RoomBooking> findByUser(Person user);

    List<RoomBooking> findAll();
}
