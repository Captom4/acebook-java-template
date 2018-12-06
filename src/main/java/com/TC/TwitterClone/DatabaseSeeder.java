package com.TC.TwitterClone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private SignUpRepository signUpRepository;

    @Autowired
    public DatabaseSeeder(SignUpRepository signUpRepository) {
        this.signUpRepository = signUpRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<SigningUp> signUps = new ArrayList<>();

        signUps.add(new SigningUp("MaxFra", "MaxFra@Gmail.com", "12"));
    }
}
