package com.ganesh.repository;

/*
 * @created: 26/02/2021 - 7:25 PM
 * @author: Ganesh
 */


import com.ganesh.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Integer> {

}
