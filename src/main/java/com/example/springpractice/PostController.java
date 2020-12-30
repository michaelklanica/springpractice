package com.example.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String postsIndex(){
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String showPost(@PathVariable int id){
        return "view post #" + id;
    }

    @GetMapping("posts/create")
    @ResponseBody
    public String createPost(){
        return "view form for creating a post";
    }

    @PostMapping("posts/create")
    @ResponseBody
    public String submitPost(){
        return "create a new post";
    }


}
