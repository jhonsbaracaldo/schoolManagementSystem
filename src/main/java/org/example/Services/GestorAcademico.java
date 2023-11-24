package org.example.Services;

import org.example.Entity.Curso;
import org.example.Entity.Estudiante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestorAcademico implements ServiciosAcademicosI {

   private List<Estudiante> Estudiantes;

    private List<Curso> cursos;
    HashMap<String, ArrayList<String>> Estudianteycursos = new HashMap<>();

    @Override
    public void matricularEstudiante(Estudiante estudiante) {

    }

    @Override
    public void agregarCurso(Curso curso) {

    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) {

    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) {

    }
}
