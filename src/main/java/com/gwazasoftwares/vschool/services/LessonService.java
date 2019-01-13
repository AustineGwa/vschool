package com.gwazasoftwares.vschool.services;

import com.gwazasoftwares.vschool.Models.Lesson;
import com.gwazasoftwares.vschool.repositories.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LessonService {
    @Autowired
    LessonRepository lessonRepository;
    public List<Lesson> getAllLessons(){

        return lessonRepository.findAll();
    }

    public void submitLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }
}
