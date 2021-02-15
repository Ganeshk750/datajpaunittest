package com.ganesh.model;

/*
 * @created: 15/02/2021 - 6:22 PM
 * @author: Ganesh
 */


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tutorials")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
    @Column(name="published")
    private String published;

    @Override
    public String toString() {
        return "TutorialRepository{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", published='" + published + '\'' +
                '}';
    }
}
