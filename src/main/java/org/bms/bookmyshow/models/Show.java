package org.bms.bookmyshow.models;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "shows")
public class Show extends BaseModel {
    @ManyToOne
    private Movie movie;
    private Date startTime;
    @OneToOne
    private Screen screen;
    private int duration;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Features> features;
}
