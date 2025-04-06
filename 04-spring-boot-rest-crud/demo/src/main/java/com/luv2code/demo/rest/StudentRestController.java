package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;
    //define @PostConstruct to load the student data(only onece)
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Poorninma", "Mery"));
        theStudents.add(new Student("Nick", "Stiff"));
        theStudents.add(new Student("Calvin", "More"));
    }

    //define endpoint for "/students" - return list of students

    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }
    //define endpoint or "/students/{studentId} - return student at index"

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        //just index into the list

        //check the studentId again list size
        if ((studentId >= theStudents.size() || (studentId < 0)) ){
            throw new CustomExceptionClass("Student id not found " + studentId);
        }
        return theStudents.get(studentId);
    }




}






























