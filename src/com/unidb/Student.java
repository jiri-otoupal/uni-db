package com.unidb;


import java.util.Date;

public class Student extends Person {


    protected Date enrolledDate;
    private studyTypes studyType;

    public Student(String firstName, String lastName, studyTypes studyType, Date enrolledDate) {
        super(null, firstName, lastName);
        this.studyType = studyType;
        this.enrolledDate = enrolledDate;
    }


    enum studyTypes {
        Bachelor,
        Masters,
        Doctor
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrolledDate=" + enrolledDate +
                ", studyType=" + studyType +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
