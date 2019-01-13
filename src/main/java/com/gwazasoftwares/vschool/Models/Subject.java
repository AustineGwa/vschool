package com.gwazasoftwares.vschool.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {

    @Id
    private String code;
    private String name;

    public Subject() {
    }

    public Subject(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
