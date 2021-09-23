package com.suraksha.javacore2021aug.day007;


import java.time.LocalDate;

public class student {


    //Name, Class, Section, Roll Number, Address, Contact Address, Date of Birth, School
    private String firstName;
    private String lastname;
    private Integer studentclass;
    private Character section;
    private String address;
    private LocalDate dateofBirth;
    private String school;

    public String displayFullName() {
        //Local variable :Full Name
        String fullName = firstName.concat(" ").concat(lastname);
        return fullName;
    }

    //Methods / Functions : public
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(Integer studentclass) {
        this.studentclass = studentclass;
    }

    public Character getSection() {
        return section;
    }

    public void setSection(Character section) {
        this.section = section;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


}




















