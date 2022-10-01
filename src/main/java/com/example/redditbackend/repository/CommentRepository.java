package com.example.redditbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.redditbackend.model.Comment;
import com.example.redditbackend.model.Post;
import com.example.redditbackend.model.User;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
