package org.example.services;

import org.example.Domain.dntity.Course;
import org.example.Domain.dntity.Student;

public interface ServicesAcademicI {

    void enrollStudent(Student student);

   void addCoruse(Course course);
    void enrollStudentCourse(Student student,Course course);
    void unsubscribeStudentCourse(Student student, Course course);

}
