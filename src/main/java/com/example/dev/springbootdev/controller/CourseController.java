package com.example.dev.springbootdev.controller;

import com.example.dev.springbootdev.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/getAllCourses")
    public List<Course> getData() {
        return Arrays.asList(
                new Course(1, "Test -- 1", "Shakib"),
                new Course(2, "Test -- 2", "Shakib"),
                new Course(3, "Test -- 2", "Shakib")
        );
    }
}
