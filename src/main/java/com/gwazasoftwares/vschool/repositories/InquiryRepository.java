package com.gwazasoftwares.vschool.repositories;

import com.gwazasoftwares.vschool.Models.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquiryRepository extends JpaRepository<Inquiry, Integer> {
}
