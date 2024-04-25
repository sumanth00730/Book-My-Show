package org.bms.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    @ManyToOne
    private User user;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    private Date bookedAt;
    private Date bookedDate;
    @ManyToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private Show show;
    private int amount;
    @OneToMany(mappedBy = "booking")
    private List<Payment> payments;
}
