package com.TC.TwitterClone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {
    private List<Posts> messageContent;

    public PostsController(){
        messageContent = new ArrayList<>();

        messageContent.add(new Posts("TestUser", "Hello this is my test post on acebook!"));

    }
    @RequestMapping(value = "/all", method = RequestMethod.GET )
    public List<Posts> getAll(){
        return messageContent;
    }
}
