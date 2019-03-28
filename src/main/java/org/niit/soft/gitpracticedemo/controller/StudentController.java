package org.niit.soft.gitpracticedemo.controller;

import org.niit.soft.gitpracticedemo.entity.Student;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
<<<<<<< HEAD

=======
    public Student helloStudent(){
        Student student = new Student();
        student.setUsername("李huofang");
        student.setClassName("软件1721");
        student.setAge(20);
        return student;
    }
>>>>>>> 3c47181621e9c39ba3a05a8a09b513699cb2f98c
}
