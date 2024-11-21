package zuzz.test.securiy_example_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @GetMapping("/profile")
    public String userProfile() {
        return "Hello from user profile :)";
    }
}
