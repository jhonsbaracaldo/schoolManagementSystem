package org.example.Services;

import org.example.Domain.Entity.Course;
import org.example.Domain.Entity.Student;

public interface ServicesAcademicI {

    void enrollStudent(Student student);

   void addCoruse(Course course);
    void enrollStudentCourse(Student student,Course course);
    void unsubscribeStudentCourse(Student student, Course course);

}
