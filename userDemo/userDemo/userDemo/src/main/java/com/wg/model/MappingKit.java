package com.wg.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

public class MappingKit {
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("user", "id", UserModel.class);
		arp.addMapping("role", "id", RoleModel.class);
		arp.addMapping("permission", "id", PermissionModel.class);
		
	}

}
