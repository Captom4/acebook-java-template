package com.TC.TwitterClone;

public class Posts {
    private String username;
    private String postBody;

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
}

