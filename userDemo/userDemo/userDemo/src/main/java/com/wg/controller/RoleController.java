package com.wg.controller;

import java.util.List;

import com.jfinal.core.Controller;
import com.wg.model.RoleModel;
import com.wg.service.RoleService;

public class RoleController extends Controller {
	
	 RoleService RoleService = new RoleService();
	 
	 public void index() {
		 List<RoleModel> findAll = RoleService.findAll();
		 for (RoleModel record : findAll) {
			 System.out.println(record);
		}
		setAttr("roleList", findAll);
		render("role.html");
	
	 }
	 
	 public void deleteRole() {
	    RoleService.deleteById(getParaToInt());
		redirect("/role");
	 }
	 
}
