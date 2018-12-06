package com.TC.TwitterClone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/SignUp")
public class SignUpController {

    private SignUpRepository signUpRepository;

    @Autowired
    public  SignUpController(SignUpRepository signUpRepository) {
        this.signUpRepository = signUpRepository;
    }

    @RequestMapping(value = "/AllUsers", method =  RequestMethod.GET)
    public List<SigningUp> getAll() {
        return signUpRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<SigningUp> create(@RequestBody SigningUp signingUp) {
        signUpRepository.save(signingUp);
        
        return signUpRepository.findAll();
    }
}
