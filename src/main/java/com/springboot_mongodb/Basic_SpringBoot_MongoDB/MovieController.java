package com.springboot_mongodb.Basic_SpringBoot_MongoDB;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @GetMapping
    public ResponseEntity<String> allMovies(){
        return new ResponseEntity<>("List of all movies",HttpStatus.OK);
    }
    
}
