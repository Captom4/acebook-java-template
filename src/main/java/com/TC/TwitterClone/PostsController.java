package com.TC.TwitterClone;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/posts")
public class PostsController {
    private List<Posts> messageContent;

    public PostsController(){
        messageContent = new ArrayList<>();

        messageContent.add(new Posts("TestUser", "Hello this is my test post on acebook!"));
        messageContent.add(new Posts("user", "Hello this is my test post on acebook!"));

    }
    @RequestMapping(value = "/all", method = RequestMethod.GET )
    public List<Posts> getAll(){
        return messageContent;
    }

    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    public List<Posts> getUsername(@PathVariable String username){
        return messageContent.stream().filter(x -> x.getUsername() == username)
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Posts> create (@RequestBody Posts post){
        messageContent.add(post);
        return messageContent;
    }
}
