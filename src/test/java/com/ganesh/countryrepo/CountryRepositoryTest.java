package com.ganesh.countryrepo;

/*
 * @created: 26/02/2021 - 7:30 PM
 * @author: Ganesh
 */

import com.ganesh.model.Country;
import com.ganesh.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CountryRepositoryTest {

    @Autowired
    private CountryRepository countryRepository;

    @Test
    public void testCreateCountry(){
        Country country = countryRepository.save(new Country("India"));
        assertNotNull(country);
        assertTrue(country.getId() > 0);

    }

}
