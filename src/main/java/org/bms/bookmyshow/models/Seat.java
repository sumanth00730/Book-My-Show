package org.bms.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel {
    private String seatNumber;
    private String row;
    private String column;
    private SeatType seatType;
}
