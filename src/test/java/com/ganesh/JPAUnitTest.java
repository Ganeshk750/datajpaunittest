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
    public void should_store_a_tutorial() {
        Tutorial tute = new Tutorial("Title1", "DescriptionOne", true);
        Tutorial tutorial = repository.save(tute);
        assertThat(tutorial).hasFieldOrPropertyWithValue("title", "Title1");
        assertThat(tutorial).hasFieldOrPropertyWithValue("description", "DescriptionOne");
        assertThat(tutorial).hasFieldOrPropertyWithValue("published", true);

    }

    @Test
    public void should_find_all_tutorials() {
        Tutorial t1 = new Tutorial("Tut1", "Desc1", true);
        entityManager.persist(t1);
        Tutorial t2 = new Tutorial("Tut2", "Desc2", false);
        entityManager.persist(t2);
        Tutorial t3 = new Tutorial("Tut3", "Desc3", true);
        entityManager.persist(t3);
        Iterable<Tutorial> tutorials = repository.findAll();
        assertThat(tutorials).hasSize(3).contains(t1,t2,t3);

    }

    @Test
    public void should_find_tutorial_by_id() {
        Tutorial t1 = new Tutorial("Tut1", "Desc1", true);
        entityManager.persist(t1);
        Tutorial t2 = new Tutorial("Tut2", "Desc2", false);
        entityManager.persist(t2);
        Tutorial tutResult = repository.findById(t2.getId()).get();
        assertThat(tutResult).isEqualTo(t2);

    }

    @Test
    public void should_find_published_tutorials() {
        Tutorial t1 = new Tutorial("Tut1", "Desc1", true);
        entityManager.persist(t1);
        Tutorial t2 = new Tutorial("Tut2", "Desc2", false);
        entityManager.persist(t2);
        Tutorial t3 = new Tutorial("Tut3", "Desc3", true);
        entityManager.persist(t3);
        Iterable<Tutorial> publishedTutorial = repository.findByPublished(true);
        assertThat(publishedTutorial).hasSize(2).contains(t1,t3);

    }

    @Test
    public void should_find_tutorials_by_title_containing_string() {
        Tutorial t1 = new Tutorial("Spring Boot", "Desc1", true);
        entityManager.persist(t1);
        Tutorial t2 = new Tutorial("Hibernate", "Desc2", false);
        entityManager.persist(t2);
        Tutorial t3 = new Tutorial("Spring Data JPA", "Desc3", true);
        entityManager.persist(t3);
        Iterable<Tutorial> tutorials = repository.findByTitleContaining("ring");
        assertThat(tutorials).hasSize(2).contains(t1,t3);

    }

    @Test
    public void should_update_tutorial_by_id() {
        Tutorial t1 = new Tutorial("Spring Boot", "Desc1", true);
        entityManager.persist(t1);
        Tutorial t2 = new Tutorial("Hibernate", "Desc2", false);
        entityManager.persist(t2);

        Tutorial updateTut = new Tutorial("Spring Batch", "Updated Description", true);
        Tutorial tut = repository.findById(t2.getId()).get();
        tut.setTitle(updateTut.getTitle());
        tut.setDescription(updateTut.getDescription());
        tut.setPublished(updateTut.isPublished());
        repository.save(tut);

        /* Now We r checking t2 */
        Tutorial checkTut = repository.findById(t2.getId()).get();
        assertThat(checkTut.getId()).isEqualTo(t2.getId());
        assertThat(checkTut.getTitle()).isEqualTo(updateTut.getTitle());
        assertThat(checkTut.getDescription()).isEqualTo(updateTut.getDescription());
        assertThat(checkTut.isPublished()).isEqualTo(updateTut.isPublished());
    }

    @Test
    public void should_delete_tutorial_by_id() {
        Tutorial tut1 = new Tutorial("Tut#1", "Desc#1", true);
        entityManager.persist(tut1);

        Tutorial tut2 = new Tutorial("Tut#2", "Desc#2", false);
        entityManager.persist(tut2);

        Tutorial tut3 = new Tutorial("Tut#3", "Desc#3", true);
        entityManager.persist(tut3);

        repository.deleteById(tut2.getId());

        Iterable<Tutorial> tutorials = repository.findAll();

        assertThat(tutorials).hasSize(2).contains(tut1, tut3);

    }

    @Test
    public void should_delete_all_tutorials() {
        entityManager.persist(new Tutorial("Tut#1", "Desc#1", true));
        entityManager.persist(new Tutorial("Tut#2", "Desc#2", false));

        repository.deleteAll();

        assertThat(repository.findAll()).isEmpty();

    }


}
