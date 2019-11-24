package com.example.jpa.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.jpademo.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
