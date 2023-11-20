package com.renocrewsolutions.certificategenerator.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renocrewsolutions.certificategenerator.Entity.User;
import com.renocrewsolutions.certificategenerator.Service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {

	   @Autowired
		private final UserService userService;

	    
	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    @GetMapping
	    public ResponseEntity<List<User>> getAllUsers() {
	        List<User> users = (List<User>) userService.getAllUsers();
	        return new ResponseEntity<>(users, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<User> getUserById(@PathVariable Long id) {
	        return userService.getUserById(id)
	                .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
	                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }

	    @PostMapping
	    public ResponseEntity<User> createUser(@RequestBody User user) {
	        User createdUser = userService.createUser(user);
	        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
	        user.setId(id);
	        User updatedUser = userService.updateUser(user);
	        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

}
