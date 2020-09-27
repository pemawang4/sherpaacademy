package com.sherpaacademy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sherpaacademy.models.Address;
import com.sherpaacademy.models.User;
import com.sherpaacademy.services.AddressService;
import com.sherpaacademy.services.UserService;

@RestController
@RequestMapping("/sherpaacademy")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/userSave")
	ResponseEntity<User> saveUserDetails(){
		User user = new User("Pema", "Wangchu", "Sherpa", "pema@mail.com", "password", "Male", 5454);
		Address address = new Address("343 Austin Highway", "Apt 3", "San Antonio", "TX", 33456, "United State");
		user.setAddress(address);
		address.setUser(user);
		User user2 = userService.saveUserDetails(user);
		addressService.saveUserAddress(address);
		
		return new ResponseEntity<User>(user2, HttpStatus.OK);
	}
	

}
