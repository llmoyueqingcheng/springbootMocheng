package com.wg.service;

import java.util.List;
import java.util.Random;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.wg.model.UserModel;

public class UserService {
	 private UserModel dao = new UserModel().dao();
	
	 public void add(String userid){
         Record user = new Record().set("newstitle", userid);
         Db.save("news", user);
 }
	 public List<UserModel> findAll(){
		 List<UserModel> find = dao.find("select * from user");
		 return find;
	 }
	 
	public void deleteById(Integer paraToInt) {
		dao.deleteById(paraToInt);
	}
	public void addUser() {
	    Record user = new Record().set("name", "张三").set("password", "000");
		Db.save("user", user);
		
	}
	

}
