package com.unidb;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Faculty extends Persistable {
    protected String tag;
    protected String name;
    protected String description;

    protected Map<Integer, Person> personMap;

    public Faculty(String tag, String name, String description) {
        this.tag = tag;
        this.name = name;
        this.description = description;
        personMap = new HashMap<>();
    }

    public Faculty addPerson(Person person) {
        if (personMap.get(person.id) != null) {
            throw new RuntimeException("Person already in faculty");
        }
        personMap.put(person.id, person);
        return this;
    }

    public Faculty removePerson(Person person) {
        this.personMap.remove(person.id);
        return this;
    }


    @Override
    public String toString() {
        return "Faculty{" +
                "tag='" + tag + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", personMap=" + personMap +
                '}';
    }
}
