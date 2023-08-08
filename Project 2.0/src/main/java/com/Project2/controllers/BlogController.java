package com.Project2.controllers;
import com.Project2.models.Post;
import com.Project2.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;
    @GetMapping("/blog")
    public String Blog (Model model){
        Iterable<Post> posts = postRepository.findAll();
        return "blog-main";
    }
}

