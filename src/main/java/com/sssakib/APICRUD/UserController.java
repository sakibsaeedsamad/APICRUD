package com.sssakib.APICRUD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    
    @GetMapping("/allUser")
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}




	@PostMapping("/insertUser")
	public User addUser(@RequestBody User user) {
    	
    	return userRepository.save(user);
	}


	@PutMapping("/updateUser/{id}")
    public User updateUser(@RequestBody User user,  @PathVariable long id) {
    	User existingUser = userRepository.findById(user.getId()).orElse(null);
		existingUser.setName(user.getName());
		existingUser.setNumber(user.getNumber());
		existingUser.setAge(user.getAge());
		existingUser.setGender(user.getGender());
		existingUser.setLocation(user.getLocation());
		existingUser.setImage(user.getImage());
		return userRepository.save(existingUser);
    }
    
    @DeleteMapping("/deleteUser/{id}")
	public DeleteResponse deleteUser(@PathVariable int id) {
    	DeleteResponse delres = new DeleteResponse();
    	
    	userRepository.deleteById(id);
    	delres.setDeleteCode("1");
    	delres.setDeleteMessage("USER Delete SUCCESSFULLY");

		return  delres;
	}
    
    
}
