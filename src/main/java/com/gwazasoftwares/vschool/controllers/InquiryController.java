package com.gwazasoftwares.vschool.controllers;

import com.gwazasoftwares.vschool.Models.Inquiry;
import com.gwazasoftwares.vschool.services.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-v1/inquiries")
public class InquiryController {

    @Autowired
    InquiryService inquiryService;

    @RequestMapping("/all")
    public List<Inquiry> getAllInquiries(){
      return inquiryService.getAllInquieries();
    }

    @PostMapping
    public void submitInquiry(@RequestBody Inquiry inquiry){
        inquiryService.submitInquiry(inquiry);
    }


}
