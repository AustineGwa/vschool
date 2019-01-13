package com.gwazasoftwares.vschool.controllers;

import com.gwazasoftwares.vschool.Models.Tutor;
import com.gwazasoftwares.vschool.services.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api-v1/tutors")
public class TutorController {

    @Autowired
    TutorService tutorService;

    @RequestMapping("/all")
    public List<Tutor> getAllTutors(){
        return tutorService.getAllTutors();
    }

    @PostMapping
    public void addTutor(@RequestBody Tutor tutor){
        tutorService.addTutor(tutor);
    }


}
