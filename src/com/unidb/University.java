package com.unidb;

import java.util.ArrayList;
import java.util.List;

public class University extends Persistable {
    private final List<Faculty> facultyList;

    public University() {
        this.facultyList = new ArrayList<>();
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }

    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    @Override
    public String toString() {
        return "University{" +
                "facultyList=" + facultyList +
                '}';
    }
}
