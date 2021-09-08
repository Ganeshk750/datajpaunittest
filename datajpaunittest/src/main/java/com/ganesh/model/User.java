package com.ganesh.model;

/*
 * @created: 03/03/2021 - 12:40 PM
 * @author: Ganesh
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 128, nullable = false, unique = true)
    private String email;

    @Column(length = 64, nullable = false)
    private String password;

    @Column(name="full_name", nullable = false, length = 64)
    private String fullName;

    @Column(nullable = false, length = 64)
    private String photos;
}
