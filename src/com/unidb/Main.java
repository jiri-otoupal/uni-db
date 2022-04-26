package com.unidb;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        University university = new University();
        university.addFaculty(new Faculty("FIS", "Faculty Informatics", "10101"));

        Student student = new Student("", "", Student.studyTypes.Bachelor, new Date());

        university.getFacultyList().get(0).addPerson(student).addPerson(student);

    }
}
