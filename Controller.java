package com.example.webProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

   @RestController
public class Controller {

   @GetMapping("/calc/{operator}/{a}/{b}")
   public String findAnswer(@PathVariable("a") int a, @PathVariable("b") int b, @PathVariable("operator") String operator){
        int answer ;
        String output = null;
        if (operator.equals("mult")){
           answer = a * b;
           output= ""+answer+"";
        }

      if (operator.equals("subtract")){
         answer = a - b;
         output= ""+answer+"";
      }

      if (operator.equals("sum")){
         answer = a + b;
         output= ""+answer+"";
      }

      if (operator.equals("div")){
         answer = a / b;
         output= ""+answer+"";
      }

      return output;
   }

}
