package com.gwazasoftwares.vschool.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lesson {

    @Id
    @GeneratedValue
    private int id;
    private String tutorId;
    private  String title;
    private String subjectCode;
    private String videolink;

    public Lesson() {
    }

    public Lesson(int id, String tutorId, String title, String subjectCode, String videolink) {
        this.id = id;
        this.tutorId = tutorId;
        this.title = title;
        this.subjectCode = subjectCode;
        this.videolink = videolink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getVideolink() {
        return videolink;
    }

    public void setVideolink(String videolink) {
        this.videolink = videolink;
    }
}
