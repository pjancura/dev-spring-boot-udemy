package com.pjancura.spring.core.controller;

import com.pjancura.spring.core.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;


    @Value("${info.app.name:NOT_FOUND}")
    private String infoAppName;

    @GetMapping("/test-info")
    public String testInfo() {
        return infoAppName;
    }


    // tells spring to inject a dependency
    // define a constructor for dependency injection
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
