package org.niit.soft.gitpracticedemo.entity;

public class Student {
    private String username;
    private int age;
    private String className;

    public Student() {
    }

    public Student(String username, int age, String className) {
        this.username = username;
        this.age = age;
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
