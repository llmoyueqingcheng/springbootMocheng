package com.wg.es;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;


public class EsService{
	
	  public final static String HOST = "192.168.16.21";
	     
	     public final static int PORT = 9300;//http请求的端口是9200，客户端是9300
	     
	     /**
	      * 测试Elasticsearch客户端连接
	      * @Title: test1 
	      * @author sunt  
	      * @date 2017年11月22日
	      * @return void
	      * @throws UnknownHostException 
	      */
	     public static TransportClient testClient() throws UnknownHostException{
	    	 //创建客户端
	         TransportClient client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddresses(
	                                  new InetSocketTransportAddress(InetAddress.getByName(HOST),PORT));
	         
	         System.out.println(client.toString());
	         GetResponse getResponse = client.prepareGet("appdata", "appdata", "cd849c2c393bd40290680072a2b82cadz1").get();
	         System.out.println(("索引库的数据:" + getResponse.getSourceAsString()));
	         
	         //关闭客户端
	         return client;
	     }
	        
	         

	   
	
	
	
}
