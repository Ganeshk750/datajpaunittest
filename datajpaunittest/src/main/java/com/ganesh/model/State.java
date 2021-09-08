package com.ganesh.model;

/*
 * @created: 26/02/2021 - 7:12 PM
 * @author: Ganesh
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.profile.Fetch;

import javax.persistence.*;

@Entity
@Table(name="states")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;

    public State(){}


    public State(String name, Country country) {
        this.name = name;
        this.country= country;
    }


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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}