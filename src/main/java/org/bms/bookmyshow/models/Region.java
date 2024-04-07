package org.bms.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Region extends BaseModel {
    private String name;
    private List<Theater> theaterList;
    private List<Movie> movieList;
}
