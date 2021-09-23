package com.suraksha.javacore2021aug.day007;

import java.time.LocalDate;

public class Classroom {
    public static void main(String[] args) {
        //class name = Student
        //object/variable/instance name : firststudent
        //new = keyword to create a new object
        //constructor = special type of method that is called during object creation = Student()
        //variable / fields : private
        //Instance / Object variable


        student firststudent = new student();
        firststudent.setFirstName("Suraksha");
        firststudent.setLastname("Dulal");
        firststudent.setStudentclass(8);
        firststudent.setSection('A');
        firststudent.setAddress("Kathmandu, Nepal");
        firststudent.setDateofBirth(LocalDate.of(1999, 1, 1));
        firststudent.setSchool("Universal HSS");

        System.out.println("First Student detail : ");
        System.out.println("First Name : " + firststudent.getFirstName());
        System.out.println("Last Name : " + firststudent.getLastname());
        System.out.println("Full Name : " + firststudent.displayFullName());
        System.out.println("Student Class : " + firststudent.getStudentclass());
        System.out.println("Section : " + firststudent.getSection());
        System.out.println("Address : " + firststudent.getAddress());
        System.out.println("DateofBirth : " + firststudent.getDateofBirth());
        System.out.println("School : " + firststudent.getSchool());



        student secondstudent = new student();
        secondstudent.setFirstName("San");
        secondstudent.setLastname("Dan");
        secondstudent.setStudentclass(9);
        secondstudent.setSection('B');
        secondstudent.setAddress("New York, USA");
        secondstudent.setDateofBirth(LocalDate.of(2000, 6, 1));
        secondstudent.setSchool("Oxford HSS");

        System.out.println("First Student detail : ");
        System.out.println("First Name : " + secondstudent.getFirstName());
        System.out.println("Last Name : " + secondstudent.getLastname());
        System.out.println("Full Name : " + secondstudent.displayFullName());
        System.out.println("Student Class : " + secondstudent.getStudentclass());
        System.out.println("Section : " + secondstudent.getSection());
        System.out.println("Address : " + secondstudent.getAddress());
        System.out.println("DateofBirth : " + secondstudent.getDateofBirth());
        System.out.println("School : " + secondstudent.getSchool());

        student student = new student();




    }
}
