package com.cinema;

import com.constants.Address;

import java.util.List;

public class Cinema {
    String name;
    int totalCinemaHalls;
    Address address;
    List<CinemaHall> halls;

    public Cinema(String name, int totalCinemaHalls, Address address, List<CinemaHall> halls) {
        this.name = name;
        this.totalCinemaHalls = totalCinemaHalls;
        this.address = address;
        this.halls = halls;
    }
}
