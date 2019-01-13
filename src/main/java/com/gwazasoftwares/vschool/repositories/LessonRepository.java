package com.gwazasoftwares.vschool.repositories;

import com.gwazasoftwares.vschool.Models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
}
