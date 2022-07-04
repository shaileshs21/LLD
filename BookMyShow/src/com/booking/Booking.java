package com.booking;

import com.constants.BookingStatus;
import com.show.Show;

import java.lang.reflect.Member;
import java.util.Date;
import java.util.List;

public class Booking {
    long bookingNumber;
    int numberOfSeats;
    BookingStatus status;
    Show show;
    List<ShowSeat> show_seats;
    Payment payment;
    Date createdOn;
    Member member;
    double totalAmount;

    public Booking(long bookingNumber, int numberOfSeats, BookingStatus status, Show show, List<ShowSeat> show_seats, Payment payment) {
        this.bookingNumber = bookingNumber;
        this.numberOfSeats = numberOfSeats;
        this.status = status;
        this.show = show;
        this.show_seats = show_seats;
        this.payment = payment;
        this.createdOn = new Date();
    }

    public boolean makePayment(Payment payment){
        return true;
    }
}
