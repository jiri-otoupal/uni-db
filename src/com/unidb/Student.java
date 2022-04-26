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

    @Override
    public void encode() {

    }

    @Override
    public void decode() {

    }

    enum studyTypes {
        Bachelor,
        Masters,
        Doctor
    }
}
