package org.example.dto;

import org.example.domain.entity.Course;
import org.example.domain.entity.Student;
import org.example.services.AcademicManager;

import java.util.Scanner;

public class Menu {

   Student student = new Student();

   Course course= new Course();
     AcademicManager academicManager = new AcademicManager();
    public void Menu (){
        int seleccion = ValidationMenu();
        while(seleccion!=6)

        {
            switch (seleccion) {

                case 1 -> academicManager.enrollStudent(student);
                case 2 -> academicManager.addCoruse(course);
                case 3 -> academicManager.enrollStudentCourse(student,course);
                case 4 -> academicManager.unsubscribeStudentCourse(student,course);






            }
            seleccion = ValidationMenu();


        }

    }



    private int ValidationMenu() {


        System.out.println(" Welcome Academic ");
        System.out.println("1.add student    ");
        System.out.println("2.add course     ");
        System.out.println("3.Enrroll course ");
        System.out.println("4.Disengage from the course   ");
        System.out.print("Enter your option:  (1 - 4) ");
        Scanner scanner = new Scanner(System.in);
        int seleccion = 6;
        try {
            seleccion = scanner.nextInt();
            if (seleccion < 1 || seleccion > 6) {
                System.out.println("invalid option try again");
                ValidationMenu();
            }
        } catch (Exception e) {
            System.out.println("invalid option try again");
            ValidationMenu();
        }
        return seleccion;



    }
}
