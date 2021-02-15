package com.ganesh;

/*
 * @created: 15/02/2021 - 6:35 PM
 * @author: Ganesh
 */


import com.ganesh.model.Tutorial;
import com.ganesh.repository.TutorialRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JPAUnitTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    TutorialRepository repository;

    @Test
    public void should_find_no_tutorial_if_repository_is_empty(){
        Iterable<Tutorial> tutorials = repository.findAll();
        assertThat(tutorials).isEmpty();
    }


    @Test
    public void should_store_a_tutorial() { }

    @Test
    public void should_find_all_tutorials() { }

    @Test
    public void should_find_tutorial_by_id() { }

    @Test
    public void should_find_published_tutorials() { }

    @Test
    public void should_find_tutorials_by_title_containing_string() { }

    @Test
    public void should_update_tutorial_by_id() { }

}
