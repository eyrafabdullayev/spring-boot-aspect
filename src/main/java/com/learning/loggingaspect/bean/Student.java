package com.learning.loggingaspect.bean;

public class Student {

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        System.out.println("Age : " + age );
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void printThrowException() {
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
