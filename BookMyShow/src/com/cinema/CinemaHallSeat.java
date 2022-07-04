package com.cinema;

import com.constants.SeatStatus;
import com.constants.SeatType;

public class CinemaHallSeat {
    String seatId;
    SeatType seatType;
    SeatStatus seatStatus;
    Double price;

    public CinemaHallSeat() {
    }

    public CinemaHallSeat(String seatId, SeatType seatType) {
        this.seatId = seatId;
        this.seatType = seatType;
    }
}
