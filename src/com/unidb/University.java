package com.unidb;

import java.util.ArrayList;
import java.util.List;

public class University implements IPersist {
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
    public void encode() {

    }

    @Override
    public void decode() {

    }
}
