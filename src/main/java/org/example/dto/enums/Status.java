package org.example.dto.enums;

public enum Status {
        Matriculado("Matriculado"),
        Inactivo("Inactivo"),
        Graduado("Graduado");

        private String vaule;

        Status(String vaule) {
            this.vaule = vaule;
        }


}
