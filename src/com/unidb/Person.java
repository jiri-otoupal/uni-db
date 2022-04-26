package com.unidb;

abstract class Person implements IPersist {
    protected Integer id;
    protected String firstName;
    protected String lastName;

    public Person(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
