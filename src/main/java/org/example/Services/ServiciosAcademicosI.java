package org.example.Services;

import org.example.Entity.Curso;
import org.example.Entity.Estudiante;

public interface ServiciosAcademicosI {

    void matricularEstudiante(Estudiante estudiante);

   void agregarCurso(Curso curso);
    void inscribirEstudianteCurso(Estudiante estudiante, int idCurso);
    void desinscribirEstudianteCurso(int idEstudiante, int idCurso);

}
