package org.example.Entity;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
public class Estudiante {

    private Integer id;
    private String nombre;
    private String apellido;
    private Integer año;
    private Integer mes;
    private Integer dia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Estudiante(Integer id, String nombre, String apellido, Integer año, Integer mes, Integer dia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }
}
