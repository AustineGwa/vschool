package com.gwazasoftwares.vschool.services;

import com.gwazasoftwares.vschool.Models.Inquiry;
import com.gwazasoftwares.vschool.repositories.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquiryService {
    @Autowired
    InquiryRepository inquiryRepository;

    public List<Inquiry> getAllInquieries(){
        return inquiryRepository.findAll();
    }

    public void submitInquiry(Inquiry inquiry){
    inquiryRepository.save(inquiry);
    }
}
