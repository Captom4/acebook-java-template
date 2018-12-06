package com.TC.TwitterClone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/posts")
public class PostsController {

    PostRepository postRepository;

    @Autowired

    public PostsController(){
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET )
    public List<Posts> getAll(){
        return postRepository.findAll();
    }

//    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
//    public List<Posts> getUsername(@PathVariable String username){
//        return postRepository.findByUserName(username);
//    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Posts> create (@RequestBody Posts post){

        postRepository.save(post);
        return postRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<Posts> remove(@PathVariable long id){
        postRepository.deleteById(id);
        return postRepository.findAll();
    }
}
