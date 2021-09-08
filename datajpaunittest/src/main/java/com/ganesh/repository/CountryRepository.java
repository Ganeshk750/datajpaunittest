package com.ganesh.repository;

/*
 * @created: 26/02/2021 - 7:24 PM
 * @author: Ganesh
 */


import com.ganesh.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
