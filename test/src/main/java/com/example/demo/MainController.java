package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

	@Autowired
    private UserRepository userRepository;
    
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
    	userRepository.save(user);
    }
    
    @GetMapping("/users")
    public @ResponseBody Iterable<User> getAllUsers(){
    	return userRepository.findAll();
    }
}
