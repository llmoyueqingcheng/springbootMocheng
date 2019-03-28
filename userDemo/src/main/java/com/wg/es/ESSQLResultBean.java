package com.wg.es;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class ESSQLResultBean {
	//总数
	public Long total = 0l;
	//结果JSON数组
	/****示例：
	 *  [
			{
				_index: "wechat",
				_type: "wechat",
				_id: "edee19cfd4990d01b420afa154a9c16f",
				_score: 5.6466074,
				_source: {
					S: "zicai",
					gid: 3069267020030208,
					id: 0,
					idx: "0",
					is_index: 1,
					messageid: "0",
					pro: 6,
					pubtime: "2016-09-23",
					title: "不期而遇——中国意象油画五人展即将开幕",
					type: "1000",
					urlMd5: "edee19cfd4990d01b420afa154a9c16f",
					userID: "81",
					username: "文化徐汇",
					uuid: "edee19cfd4990d01b420afa154a9c16f",
					wachatname: "whxh2014"
				}
			},
			...
		]

	 */
	public JSONArray values;
	//分析集群状态用
	/**
	 * _shards: {
				total: 5,
				successful: 5,
				failed: 0
				},
	 */
	public JSONObject shards;
	
	//错误信息，默认为空，如果非空，则出错。查询获得结果后先判断errorInfo字段
	public String errorInfo;
	
	//聚合查询结果
	public JSONObject aggregations;
	
	public static Object getSourceValue(JSONObject obj,String key){
		try {
			JSONObject jo = (JSONObject)obj.get("_source");
			return jo.get(key);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
