package com.example.dev.springbootdev.service;

import com.example.dev.springbootdev.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private final List<Course> courses = new ArrayList<>();

    public void addCourse(Course c) {
        courses.add(c);
    }

    public List<Course> getAllCourse() {
        return courses;
    }
}
