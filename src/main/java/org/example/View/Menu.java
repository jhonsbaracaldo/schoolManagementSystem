package org.example.View;

import org.example.Entity.Course;
import org.example.Entity.Student;
import org.example.Services.AcademicManager;

import java.util.Scanner;

public class Menu {

   Student student = new Student();

   Course course= new Course();
     AcademicManager academicManager = new AcademicManager();
    public void Menu (){
        int seleccion = ValidationMenu();
        while(seleccion!=5)

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
        System.out.println("1. add student    ");
        System.out.println("2. add course     ");
        System.out.println("3. Enrroll course ");
        System.out.println("4. desvincular    ");
        System.out.print("Ingresa tu opción:  (1 - 4) ");
        Scanner scanner = new Scanner(System.in);
        int seleccion = 5;
        try {
            seleccion = scanner.nextInt();
            if (seleccion < 1 || seleccion > 5) {
                System.out.println("| The Option selected is not valid. Please try again |");
                ValidationMenu();
            }
        } catch (Exception e) {
            System.out.println("| The Option selected is not valid. Please try again |");
            System.out.println("Usted esta ingresado otro tipo de caracter");
            ValidationMenu();
        }
        return seleccion;



    }
}
