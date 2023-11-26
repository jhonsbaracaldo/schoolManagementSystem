package org.example.Dto.Enums;

public enum Status {
        Matriculado("Matriculado"),
        Inactivo("Inactivo"),
        Graduado("Graduado");

        private String vaule;

        Status(String vaule) {
            this.vaule = vaule;
        }


}
