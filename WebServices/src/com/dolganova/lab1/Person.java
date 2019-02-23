package com.dolganova.lab1;

/**
 * Created by Polina on 23.02.19.
 */
public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String profession;

    public Person() {
    }
    public Person(int id, String name, String surname, int age, String profession) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.profession = profession;
    }

    public String getName() { return name;}
    public String getSurname() { return surname;}
    public int getAge() { return age;}
    public String getProfession() { return profession;}
    public void setName(String name) { this.name = name;}
    public void setSurname(String surname) { this.surname = surname;}
    public void setAge(int age) { this.age = age;}
    public void setProfession(String profession) {this.profession = profession;}
}
