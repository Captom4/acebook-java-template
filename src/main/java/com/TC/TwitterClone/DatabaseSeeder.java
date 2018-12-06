package com.TC.TwitterClone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private SignUpRepository signUpRepository;
    private PostRepository postRepository;

    @Autowired
    public DatabaseSeeder(SignUpRepository signUpRepository) {

        this.signUpRepository = signUpRepository;
        this.postRepository =  postRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<SigningUp> signUps = new ArrayList<>();

        signUps.add(new SigningUp("MaxFra", "MaxFra@Gmail.com", "12"));


        List<Posts> posts = new ArrayList<>();
        posts.add(new Posts("Austen GG", "HELLO THIS IS MY FIRST POST LOL" ));

        postRepository.saveAll(posts);

        signUpRepository.saveAll(signUps);

    }
}
