package org.example.Domain.dntity;

import java.util.List;

public class Course {

    public Course(Integer id, String name, String description, Integer numCredits, String version) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.numCredits = numCredits;
        this.version = version;
    }

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumCredits() {
        return numCredits;
    }

    public Course() {
    }

    public void setNumCredits(Integer numCredits) {
        this.numCredits = numCredits;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    private String name;
    private String description;
    private Integer numCredits;
    private String version;

    @Override
    public String toString() {
        return String.format ("%-10s|%-5s|%-6s|%-8s|%-8s",getId(),getName(),getDescription(),getNumCredits(),getVersion());
    }
}