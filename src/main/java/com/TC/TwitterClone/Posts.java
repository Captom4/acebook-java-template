package com.TC.TwitterClone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String username;
    private String postBody;

    public Posts(){

    }

    public Posts(String username, String postBody){
        this.username = username;
        this.postBody = postBody;
    }

    public String getUsername(){
        return username;
    }

    public String getPostBody(){
        return postBody;
    }

    public long getId() {
        return id;
    }
}

