package com.gwazasoftwares.vschool.controllers;


import com.gwazasoftwares.vschool.Models.Lesson;
import com.gwazasoftwares.vschool.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-v1/lessons")
public class LessonController {

    @Autowired
    LessonService lessonService;

    @RequestMapping("/all")
    public List<Lesson> getAllUsers() {

      return   lessonService.getAllLessons();

    }

    @PostMapping
    public void submitLesson(@RequestBody Lesson lesson){
        lessonService.submitLesson(lesson);
    }



}
