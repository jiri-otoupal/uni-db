package com.unidb;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Faculty implements IPersist {
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
        int nextId = 0;

        if (personMap.containsValue(person))
            return this;

        if (!personMap.isEmpty())
            nextId = Collections.max(personMap.keySet()) + 1;

        if (person.id == null)
            person.id = nextId;

        personMap.put(nextId, person);
        return this;
    }

    @Override
    public void encode() {

    }

    @Override
    public void decode() {

    }
}
