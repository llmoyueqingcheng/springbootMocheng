package com.wg.controller;


import java.net.UnknownHostException;


import com.alibaba.fastjson.JSONObject;
import com.jfinal.core.Controller;
import com.wg.es.ESSQLResultBean;
import com.wg.es.EsService;





/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * IndexController
 */
public class IndexController extends Controller {
	
	
	private EsService esService = new EsService();
	public void index() {
		render("index.html");
	}
	
	
	public void loginAdmin() {
		//模拟管理员登录 结果放入session中
		removeSessionAttr("loginUser");
		setSessionAttr("loginUser", "admin");
		System.out.println("管理员登录成功");
		render("index.html");
	}
	public void login() {
		//模拟管理员登录 结果放入session中
		
		System.out.println(getSessionAttr("loginUser")+"");
		removeSessionAttr("loginUser");
		setSessionAttr("loginUser", "test");
		System.out.println("普通用户登录成功");
		render("index.html");
	}
	
	
	public void testES() {
		System.out.println("测试es查询");
		try {
			EsService.testClient();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		render("index.html");
	}
	
	
}



