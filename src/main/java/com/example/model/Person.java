package com.example.model;

public class Person {

    private String name;

    private String sureName;

    private int age;

    private String email;

    public Person(String name, String sureName, int age, String email) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.email = email;
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
