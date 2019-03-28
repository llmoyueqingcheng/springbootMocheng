package com.wg.service;

import java.util.List;
import java.util.Random;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.wg.model.RoleModel;
import com.wg.model.UserModel;

public class RoleService {
	 private RoleModel dao = new RoleModel().dao();
	
	 public List<RoleModel> findAll(){
		 List<RoleModel> find = dao.find("select * from Role");
		 return find;
	 }
	 
	public void deleteById(Integer paraToInt) {
		dao.deleteById(paraToInt);
	}

	public Integer findRole(String sessionAttr) {
		String sql ="select b.role_id from role a LEFT JOIN role_user b on a.id=b.role_id where b.user_id= (select id from `user` where name = ?)";
		RoleModel query = dao.findFirst(sql,sessionAttr);
		System.out.println(query);
		return query.get("role_id");
	}
	 

}
