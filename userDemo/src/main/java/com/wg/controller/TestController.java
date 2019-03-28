package com.wg.controller;

import java.util.List;

import com.jfinal.core.Controller;
import com.wg.model.PermissionModel;
import com.wg.service.PermissionService;
import com.wg.service.RoleService;

public class TestController extends Controller {
	
	 PermissionService perService = new PermissionService();
	 RoleService roleService = new RoleService();
	 public void index() {
		 String sessionAttr = getSessionAttr("loginUser");
		 System.out.println("获取用户"+sessionAttr);
		 //根据用户获取角色id
		 Integer id = roleService.findRole(sessionAttr);
		 System.out.println("查询到的"+id);
		 List<PermissionModel> findAll = perService.findbyRoleId(id);
		 for (PermissionModel record : findAll) {
			 System.out.println(record);
		}
		setAttr("testList", findAll);
		render("test.html");
	
	 }
	 
	 
}
