package com.unidb;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Staaart");
/*
        University university = new University();
        university.addFaculty(new Faculty("FIS", "Faculty Informatics", "10101"));

        Student student = new Student("", "", Student.studyTypes.Bachelor, new Date());

        university.getFacultyList().get(0).addPerson(student).addPerson(student);

        university.encode();


*/


        University university2 = new University();
        university2 = (University) university2.decode();

        System.out.println(university2);

    }
}
