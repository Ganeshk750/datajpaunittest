package com.ganesh.repository;

/*
 * @created: 03/03/2021 - 12:45 PM
 * @author: Ganesh
 */


import com.ganesh.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByEmail(String email);
}
