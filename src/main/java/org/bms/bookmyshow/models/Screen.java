package org.bms.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen extends BaseModel {
    private String name;
    private List<Seat> seats;
    private List<Features> features;
    private Theater theater;
}
