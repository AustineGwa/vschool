package com.gwazasoftwares.vschool.repositories;

import com.gwazasoftwares.vschool.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer > {
}
