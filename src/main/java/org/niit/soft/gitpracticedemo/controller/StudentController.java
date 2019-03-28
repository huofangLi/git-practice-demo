package org.niit.soft.gitpracticedemo.controller;

import org.niit.soft.gitpracticedemo.entity.Student;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    public Student helloStudent(){
        Student student = new Student();
        student.setUsername("李huofang");
        student.setClassName("软件1721");
        student.setAge(20);
        return student;
    }
}
