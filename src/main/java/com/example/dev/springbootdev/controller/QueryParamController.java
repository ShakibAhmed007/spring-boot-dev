package com.example.dev.springbootdev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class QueryParamController {

    @GetMapping("/getAllCoursesById")
    public String getAllCoursesById(@RequestParam String id) {
        return "Id: " + id;
    }

    @GetMapping("/getAllCoursesByIdAndName")
    public String getAllCoursesByIdAndName(@RequestParam String id, @RequestParam String name) {
        StringBuffer sb = new StringBuffer();
        sb.append("Id: " + id);
        sb.append("Name: " + id);
        return sb.toString();
    }

    @GetMapping("/getAllCoursesByIdAndNameWithDifferentName")
    public String getAllCoursesByIdAndNameWithDifferentName(@RequestParam(name = "stId") String id, @RequestParam(name = "stName") String name) {
        StringBuffer sb = new StringBuffer();
        sb.append("Id: " + id);
        sb.append("Name: " + id);
        return sb.toString();
    }

    //optional queryparam
    @GetMapping("/getAllCoursesByIdWithOptionalQueryParam")
    public String getAllCoursesByIdWithOptionalQueryParam(@RequestParam(required = false) String id) {
        StringBuffer sb = new StringBuffer();
        sb.append("Id: " + id);
        return sb.toString();
    }
}
