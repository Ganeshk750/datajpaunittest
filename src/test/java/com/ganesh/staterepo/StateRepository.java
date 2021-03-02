package com.ganesh.staterepo;

/*
 * @created: 26/02/2021 - 8:02 PM
 * @author: Ganesh
 */


import com.ganesh.model.Country;
import com.ganesh.model.State;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.assertTrue;


@DataJpaTest
public class StateRepository {
    @Autowired
    private TestEntityManager entityManager;
   @Autowired
   StateRepository stateRepository;


//    @Test
//    public void testCreateState(){
//       Country country = entityManager.persist(new Country("India"));
//       State state;
//        state = stateRepository.save(new State("Punjab", country));
//        assertTrue(state).isNotNull();
//    }
}
