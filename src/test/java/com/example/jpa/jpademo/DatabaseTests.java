package com.example.jpa.jpademo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.jpa.jpademo.model.Post;
import com.example.jpa.jpademo.repository.PostRepository;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@ActiveProfiles("dev") // optional
class DatabaseTests {

	@Autowired
	PostRepository postRepository;

	@BeforeAll
	void setup() {
		Post post = new Post();
		post.setTitle("some title");
		post.setDescription("some description");
		post.setContent("some content");

		postRepository.save(post);
	}

	@Test
	void postCreatedTest() {
		assertTrue(postRepository.count() == 1);
	}

}
