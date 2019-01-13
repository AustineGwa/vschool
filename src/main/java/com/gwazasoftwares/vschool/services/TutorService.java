package com.gwazasoftwares.vschool.services;

import com.gwazasoftwares.vschool.Models.Tutor;
import com.gwazasoftwares.vschool.repositories.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {
    @Autowired
    TutorRepository tutorRepository;
    public List<Tutor> getAllTutors(){
        return tutorRepository.findAll();
    }

    public void addTutor(Tutor tutor) {
        tutorRepository.save(tutor);
    }
}
