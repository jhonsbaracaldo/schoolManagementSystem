package org.example.Services;

import org.example.Entity.Course;
import org.example.Entity.Student;
import org.example.Enums.Status;
import org.example.Exeception.StudentReader;

import java.time.LocalDate;
import java.util.*;

public class AcademicManager implements ServicesAcademicI {

    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    HashMap<Integer, List<Course>> StudentandoCours = new HashMap<Integer, List<Course>>();
    Calendar calendar = Calendar.getInstance();
    Scanner print = new Scanner(System.in);

    @Override
    public void enrollStudent(Student student) {

        try {
            System.out.println("Studen Registration");
            System.out.print("Enter your id:");
            student.setId(print.nextInt());
            System.out.print("Enter your name: ");
            student.setName(print.next());
            System.out.print("Enter your lastname: ");
            student.setLastname(print.next());
            System.out.print("Enter your birthday YYYY-MM-DD ");
            String dateOfBirthString = print.next();
            LocalDate birthday = LocalDate.parse(dateOfBirthString);
            student.setBirtday(birthday);
            System.out.print("Write the status:\n");
            for (Status e : Status.values()) {
                System.out.println("* " + e.name());
            }
            student.setStatus(print.next());
            Status selectedState = Status.valueOf(student.getStatus());
            Optional<Student> Search = students.stream().filter(persona -> persona.getId() == persona.getId()).findFirst();
            if (Search.isPresent()) {
                System.out.println("The student is enrolled");
            } else {
                students.add(new Student(student.getId(), student.getName(), student.getLastname(), birthday, student.getStatus()));
                System.out.println("Successful registration\n" + "Studen\n" + students);
                throw new Exception("was not registered has been added ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void addCoruse(Course course) {
        try {
            System.out.println("Course Registration");
            System.out.print("Enter your id: ");
            course.setId(print.nextInt());
            System.out.print("Enter the course name: ");
            course.setName(print.next());
            System.out.print("Enter description: ");
            course.setDescription(print.next());
            System.out.print("Enter the number of credits: ");
            course.setNumCredits(print.nextInt());
            System.out.print("Enter the version: ");
            course.setVersion(print.next());
            Optional<Course> Search = courses.stream().filter(persona -> persona.getId() == persona.getId()).findFirst();
            if (Search.isPresent()) {
                System.out.println("the courses already exist");
            } else {

                courses.add((new Course(course.getId(), course.getName(), course.getDescription(), course.getNumCredits(), course.getVersion())));
                throw new Exception("The course is not in the list, it was added successfully");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println(course.toString());
    }

    @Override
    public void enrollStudentCourse(Student student, Course course) {





        System.out.println("Ingrese el ID del estudiante: ");
        student.setId(print.nextInt());

        System.out.println("Ingrese el ID del curso: ");
        course.setId(print.nextInt());

        if (StudentandoCours.containsKey(student.getId())) {
            System.out.println("El estudiante ya esta inscrito");

        } else {
            List<Course> enrolledCourses = StudentandoCours.getOrDefault(student.getId(), new ArrayList<>());
            enrolledCourses.add(course);
            StudentandoCours.put(student.getId(), enrolledCourses);
            System.out.println(StudentandoCours);
            System.out.println(" no esta inscrito en ningun curso");
            System.out.println("Estudiante inscrito en el curso exitosamente.");


        }

    }









    @Override
    public void unsubscribeStudentCourse (Student student, Course course) {

        System.out.println("Ingrese el ID del estudiante: ");
        student.setId(print.nextInt());

        System.out.println("Ingrese el ID del curso: ");
        course.setId(print.nextInt());
        Optional<Course> Search = courses.stream().filter(persona -> persona.getId() == persona.getId()).findFirst();

        if (Search.isPresent()) {

            System.out.println("El codigo ");
        } else {

            // Verificar si el estudiante ya está en el HashMap
            List<Course> enrolledCourses = StudentandoCours.getOrDefault(student.getId(), new ArrayList<>());
            enrolledCourses.remove(course);
            StudentandoCours.put(student.getId(), enrolledCourses);
        }
        System.out.println(StudentandoCours);
        System.out.println("se removio el estudiante ");
    }

    }

