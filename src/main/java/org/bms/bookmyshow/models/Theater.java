package org.bms.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theater extends BaseModel {
    private String name;
    @ManyToOne
    private Region region;
    @OneToMany
    private List<Show> shows;
}
