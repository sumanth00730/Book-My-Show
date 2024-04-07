package org.bms.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Booking extends BaseModel {
    private User user;
    private BookingStatus bookingStatus;
    private Date bookedDate;
    private List<ShowSeat> showSeats;
    private Show show;
    private int amount;
    private List<Payment> payments;
}
