package org.example.Entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class People {





        private Integer id;
        private String name;
        private String lastname;
        private LocalDate birtday ;

    public LocalDate getBirtday() {
        return birtday;
    }

    public void setBirtday(LocalDate birtday) {
        this.birtday = birtday;
    }

    public People() {
        }

        public People(Integer id, String name, String lastname,LocalDate birtday) {
            this.id = id;
            this.name = name;
            this.lastname = lastname;


        }

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

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }




    }


