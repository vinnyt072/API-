package com.Demo.Springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/test")
    public String test() {
        return "Controller is working!";
    }

    @GetMapping("/tasks")
    public String getTasks() {
        return "Tasks endpoint working!";
    }
}
