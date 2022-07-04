package hotel.controller;

import hotel.entities.City;
import hotel.entities.Hotel;
import hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {

    private HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService){
        this.hotelService = hotelService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "hotel")
    public List<Hotel> getAllHotel(){
        return hotelService.getAllHotels();
    }

    @RequestMapping(method = RequestMethod.GET, value = "hotel/{id}")
    public Hotel getHotelById(@PathVariable("id") Long id){
        return hotelService.getHotelById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "hotel/{id}")
    public void deleteHotelById(@PathVariable("id") Long id){
        hotelService.deleteHotelById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "hotel/closest")
    public List<Hotel> getHotelsClosestToCity(@RequestParam("city") City city){
        return hotelService.getClosestToCity(city);
    }
}
