package com.gwazasoftwares.vschool.repositories;

import com.gwazasoftwares.vschool.Models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, String> {
}
