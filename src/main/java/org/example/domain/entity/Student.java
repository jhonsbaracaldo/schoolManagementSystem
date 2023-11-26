package org.example.domain.entity;

import java.time.LocalDate;

public class Student extends People {

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public Student() {
    }

    public Student(Integer id, String name, String lastname, LocalDate birthday, String status) {
        super(id, name, lastname, birthday);
        this.status = status;
    }

    @Override
    public String toString() {
        return   String.format ("%-10s|%-5s|%-6s|%-8s|%-8s",getId(),getName(),getLastname(), getBirthday(), status );

    }
}
