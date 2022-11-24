package com.feignExample.feignExample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonPlaceHolderController {

	@Autowired
	JSONPlaceHolderClient client;
	
	@GetMapping("/posts")
	public List<Post> getPosts() {
		return client.getPosts();
	}
	
	@GetMapping("/posts/{postId}")
	public Post getPostById(@PathVariable("postId") long postId) {
		return client.getPostById(postId);
	}
	
}
