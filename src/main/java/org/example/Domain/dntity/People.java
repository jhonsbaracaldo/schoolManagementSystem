package org.example.Domain.dntity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class People {
        private Integer id;
        private String name;
        private String lastname;
        private LocalDate birthday ;

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public People() {
        }

        public People(Integer id, String name, String lastname,LocalDate birthday) {
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


