package com.cinema;

import com.constants.Address;
import com.show.Movie;
import com.show.Show;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class CinemaHall {
    int cinemaHallId;
    String name;
    Address address;

    int totalSeats;
    List<CinemaHallSeat> seats;
    List<Show> shows;

    public CinemaHall(String name, int totalSeats, List<CinemaHallSeat> seats, List<Show> shows) {
        this.name = name;
        this.totalSeats = totalSeats;
        this.seats = seats;
        this.shows = shows;
    }

    public Map<Date, Movie> getMovies(List<Date> dateList){
        return null;
    }

    public Map<Date, Show> getShows(List<Date> dateList){
        return null;
    }

}
