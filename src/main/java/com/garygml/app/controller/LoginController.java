package com.garygml.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.garygml.app.entity.user.User;
import com.garygml.app.service.user.UserService;

@Controller
public class LoginController {

	
	@Autowired
	UserService userService;
	
	@RequestMapping(path="/", method = RequestMethod.GET)
	public String welcome(Model model) {
		return "welcome";
	}
	
	@RequestMapping(path="/login", method = RequestMethod.GET)
	public String login(Model model){
		List<User> userList = userService.getAllUsers();
		model.addAttribute("userList", userList);
		return "login";
	}
}
