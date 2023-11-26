package org.example.exeception;

public class StudentNotEnrolledInCourseException extends Exception{

    public StudentNotEnrolledInCourseException() {
        super("The student is not enrolled or the ID does not match");
    }
}
