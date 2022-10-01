package com.example.redditbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.redditbackend.model.Post;
import com.example.redditbackend.model.Subreddit;
import com.example.redditbackend.model.User;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
