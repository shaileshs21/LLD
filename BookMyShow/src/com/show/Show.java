package com.show;

import com.cinema.CinemaHall;

import java.sql.Timestamp;
import java.util.Date;

public class Show {
    String id;
    CinemaHall played_at;
    Date start_time;
    Date end_time;
    Movie movie;

    public Show(String id, CinemaHall played_at, Date start_time, Date end_time, Movie movie) {
        this.id = id;
        this.played_at = played_at;
        this.start_time = start_time;
        this.end_time = end_time;
        this.movie = movie;
    }
}
