package com.springwork.course.resources;

import com.springwork.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Wallace", "wallace@gmail.com", "81970707070", "joji");
        return ResponseEntity.ok().body(user);
    }
}
