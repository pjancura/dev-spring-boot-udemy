package com.pjancura.spring.core.service;

import com.pjancura.spring.core.interfaces.Coach;
import org.springframework.stereotype.Component;

// @Component marks the class as a Spring Bean
// makes the component available for dependency injection
@Component
public class CricketCoach implements Coach {

   @Override
   public String getDailyWorkout() {
       return "Practice fast bowling for 15 minutes";
   }
}

