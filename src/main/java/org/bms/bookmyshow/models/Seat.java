package org.bms.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String seatNumber;

    private int rowVal;

    private int columnVal;

    @ManyToOne
    private SeatType seatType;
}