package com.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebContorller {

   @GetMapping("/")
   public String home() {
    return "환영합니다";
   }
    
}