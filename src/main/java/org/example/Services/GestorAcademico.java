package org.example.Services;

import org.example.Entity.Curso;
import org.example.Entity.Estudiante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestorAcademico {

   private List<Estudiante> Estudiantes;

    private List<Curso> cursos;
    HashMap<String, ArrayList<String>> Estudianteycursos = new HashMap<>();
}
