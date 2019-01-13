package com.gwazasoftwares.vschool.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SuccessStory {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String message;
    private String videoLink;

    public SuccessStory() {
    }

    public SuccessStory(int id, String name, String email, String message, String videoLink) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
        this.videoLink = videoLink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
}
