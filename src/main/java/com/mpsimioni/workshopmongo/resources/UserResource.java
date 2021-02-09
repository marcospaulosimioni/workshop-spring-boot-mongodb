package com.mpsimioni.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpsimioni.workshopmongo.domain.User;

@RestController
@RequestMapping(method=RequestMethod.GET)
public class UserResource {

	@RequestMapping(value = "/users")
	public ResponseEntity<List<User>> findAll(){
		User eu = new User("1", "Marcos Paulo Simioni", "mpsimioni@hotmail.com");
		User vc = new User("2", "Maisa Marques Monteiro", "maisammonteiro@hotmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(eu, vc));
		return ResponseEntity.ok().body(list);
	}
}
