package com.TC.TwitterClone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TCController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
