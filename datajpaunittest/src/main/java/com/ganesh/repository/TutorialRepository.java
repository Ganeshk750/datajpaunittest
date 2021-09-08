package com.ganesh.repository;

/*
 * @created: 15/02/2021 - 6:23 PM
 * @author: Ganesh
 */

import com.ganesh.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
