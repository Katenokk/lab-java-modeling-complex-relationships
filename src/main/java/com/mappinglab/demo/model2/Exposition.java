package com.mappinglab.demo.model2;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@Table(name = "exposition")
@DiscriminatorValue(value="Exposition")
public class Exposition extends Event {



    public Exposition(Date date, Double duration, String location, String title, List<Guest> guests) {
        super(date, duration, location, title, guests);
    }
}
