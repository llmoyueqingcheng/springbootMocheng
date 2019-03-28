package com.wg.model;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

@SuppressWarnings("serial")
public class BaseUserModel <M extends BaseUserModel<M>> extends Model<M> implements IBean{
	
	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setAccount(java.lang.String account) {
		set("account", account);
		return (M)this;
	}
	
	public java.lang.String getAccount() {
		return getStr("account");
	}

	public M setContent(java.lang.String password) {
		set("password", password);
		return (M)this;
	}
	
	public java.lang.String getContent() {
		return getStr("password");
	}
	
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}
	
}
