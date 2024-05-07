package com.springwork.course.config;

import com.springwork.course.entities.User;
import com.springwork.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Wallace", "wall@gmail.com", "81970707070", "joji");
        User u2 = new User(null, "Pezao", "pezao@gmail.com", "81960606060", "twice");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
