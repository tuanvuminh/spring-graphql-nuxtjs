package com.backend.controller;

import com.backend.model.Post;
import com.backend.service.PostRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class PostController {

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @QueryMapping
    List<Post> findAllPosts() {
        return postRepository.findAll();
    }

    @QueryMapping
    Optional<Post> findPostById(@Argument String id) {
        return postRepository.findById(id);
    }
}
