package hotel.services;

import hotel.entities.City;
import hotel.entities.Hotel;
import hotel.repositories.HotelRepository;
import hotel.util.ClosestHotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class HotelService {
    private HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    public List<Hotel> getAllHotels(){
        return hotelRepository.findAll();
    }

    public Hotel getHotelById(Long hotelId){
        Optional<Hotel> hotelResponse =  hotelRepository.findById(hotelId);
        Hotel hotel = hotelResponse.get();
        return hotel;
    }

    public void deleteHotelById(Long hotelId){
        hotelRepository.deleteById(hotelId);
    }

    public List<Hotel> getClosestToCity(City city){
        List<Hotel> allHotels = hotelRepository.findAll();
        HashMap<Hotel,Double> hotelDistance = new HashMap<>();

        for(Hotel hotel:allHotels){
            hotelDistance.put(hotel, ClosestHotel.getDistance(city, hotel.getHotelLocation()));
        }

        return hotelDistance.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
