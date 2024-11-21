package zuzz.test.securiy_example_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {
    
    @GetMapping("/hello")
    public String greeting() {
        return "Hello from public endpoint :)";
    }
}
