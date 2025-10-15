package Practical_10.demo;

import org.springframework.web.bind.annotation.*; 
@RestController 
@CrossOrigin 
public class GreetingController { 
@GetMapping("/api/greet") 
public String greet(@RequestParam(defaultValue = "World") String name) { 
return "Hello, " + name + "!"; 
55 | P a g e  
} 
} 
