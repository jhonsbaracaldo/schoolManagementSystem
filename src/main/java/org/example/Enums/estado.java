package org.example.Enums;

public enum estado {
        Matriculado(""),
        Inactivo(""),
        Graduado("");

        private String vaule;

        estado(String vaule) {
            this.vaule = vaule;
        }
}
