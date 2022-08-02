package com.example.dev.springbootdev.controller;

import com.example.dev.springbootdev.model.Course;
import com.example.dev.springbootdev.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("course/getAll")
    public List<Course> getData() {
        return courseService.getAllCourse();
    }

    @PostMapping("course/save")
    public String addCourse(@RequestBody Course c) {
        courseService.addCourse(c);
        return "Successfully Added";
    }
}
