package com.wg.service;

import java.util.List;
import java.util.Random;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.wg.model.PermissionModel;
import com.wg.model.RoleModel;
import com.wg.model.UserModel;

public class PermissionService {
	 private PermissionModel dao = new PermissionModel().dao();
	
	 public List<PermissionModel> findAll(){
		 
		 List<PermissionModel> find = dao.find("select * from permission");
		 return find;
	 }
	 
	public void deleteById(Integer paraToInt) {
		dao.deleteById(paraToInt);
	}

	public List<PermissionModel> findbyRoleId(Integer id) {
		String sql ="select * from permission a left join permission_role b on a.id=b.permission_id where b.role_id=? order by sort";
		List<PermissionModel> query = dao.find(sql,id);
		return query;
	}
	 

}
