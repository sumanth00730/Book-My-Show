package org.bms.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Show extends BaseModel {
    private Movie movie;
    private Date startTime;
    private Screen screen;
    private int duration;
    private List<Features> features;
}
