package com.mappinglab.demo.model2;

import jakarta.persistence.*;

@Entity
@Table(name = "speaker")
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Double presentationDuration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(Double presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public Speaker(String name, Double presentationDuration) {
        this.name = name;
        this.presentationDuration = presentationDuration;
    }
}
