package com.ganesh.staterepo;

/*
 * @created: 26/02/2021 - 8:02 PM
 * @author: Ganesh
 */


import com.ganesh.model.Country;
import com.ganesh.model.State;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // Used For RealTime Database Test
public class StateRepository {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private com.ganesh.repository.StateRepository stateRepository;

    @Test
    @Rollback(false)
    public void testCreateState(){
       Country country = entityManager.persist(new Country("India"));
       State newState = new State("KARNATAKA", country);
       State savedState = stateRepository.save(newState);
        assertThat(savedState).isNotNull();
        assertThat(savedState.getId()).isGreaterThan(0);
    }

    @Test
    @Rollback(false)
    public void testCreateStateRealDatabase(){
        Integer countoryId = 2;
        Country country = entityManager.find(Country.class, countoryId);

        State state = stateRepository.save(new State("PUNJAB", country));
        assertThat(state).isNotNull();
        assertThat(state.getId()).isGreaterThan(0);
    }

}
