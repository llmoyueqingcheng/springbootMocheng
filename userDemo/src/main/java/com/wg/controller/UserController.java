package com.wg.controller;

import java.util.List;

import com.jfinal.core.Controller;
import com.wg.model.UserModel;
import com.wg.service.UserService;

public class UserController extends Controller {
	
	 UserService userService = new UserService();
	 
	 public void index() {
		 List<UserModel> findAll = userService.findAll();
		 for (UserModel record : findAll) {
			 System.out.println(record);
		}
		setAttr("userList", findAll);
		render("user.html");
	
	 }
	 
	 public void addUser() {
		 userService.addUser();
		 redirect("/user");
	 }
	 
	 public void deleteUser() {
	    userService.deleteById(getParaToInt());
		redirect("/user");
	 }
	 
}
