package com.dolganova.lab1;

public class Person {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String profession;

    public Person() {
    }

    public Person(int id, String name, String surname, Integer age, String profession) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.profession = profession;
    }

    public Integer getId() { return id; }
    public String getName() { return name;}
    public String getSurname() { return surname;}
    public Integer getAge() { return age;}
    public String getProfession() { return profession;}
    public void setId(Integer id) { this.id = id;}
    public void setName(String name) { this.name = name;}
    public void setSurname(String surname) { this.surname = surname;}
    public void setAge(Integer age) { this.age = age;}
    public void setProfession(String profession) {this.profession = profession;}
}
