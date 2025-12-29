package com.example.teacherapp;

public class Teacher {

    private int id;
    private String subject;
    private String name;

    public Teacher() {}

    public Teacher(int id, String subject, String name) {
        this.id = id;
        this.subject = subject;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
