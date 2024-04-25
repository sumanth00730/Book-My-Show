package org.bms.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Region extends BaseModel {
    private String name;
    @OneToMany
    private List<Theater> theaterList;
//    @ManyToMany
//    private List<Movie> movieList;
}
