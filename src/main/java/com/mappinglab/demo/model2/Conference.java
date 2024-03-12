package com.mappinglab.demo.model2;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@Table(name = "conference")
@DiscriminatorValue(value="Conference")
public class Conference extends Event {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;

    //quitar ID??
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "event_speaker",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id")
    )
    private List<Speaker> speakers;

    public Conference(Date date, Double duration, String location, String title, List<Guest> guests) {
        super(date, duration, location, title, guests);
    }
}
