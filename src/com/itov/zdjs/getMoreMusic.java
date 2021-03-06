package com.itov.zdjs;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itov.bean.reqeustParam;
import com.itov.bean.requestHeader;
import com.itov.util.ConnUtil;


public class getMoreMusic {
	
	//云服务平台地址
	public static String remoteServer = "http://222.171.242.178:10088/zdc/";
	//应用密钥
	public static String appKey = "sshop";
	//内容签名密钥
	public static String signKey = "1qazxsw2";
	//公司标识
	public static int appid = 1;
	//公司平台标识
	public static int clientPlatform = 1;
	//
	//public static String remoteServer = "http://localhost:8098/sshop_dev/";
	/**
	 * Header配置
	 * @param param
	 * @return
	 */
	public static String jsonParam(Map param) throws Exception{
		
		requestHeader rh = new requestHeader();
		rh.setAppid(appid);
		rh.setCommand_id(1000);//客户端使用
		rh.setPlatform(clientPlatform);
		rh.setScreenX(1024);//终端屏幕尺寸-宽
		rh.setScreenY(769);//终端屏幕尺寸-高
		rh.setTerm_id("111111");//终端标识
		rh.setTimestamp();//客户端使用
		rh.setUser_id(1);//(可选)
		reqeustParam rp = new reqeustParam();
		rp.setHead(rh);
		rp.setBody(param);
		return new ObjectMapper().writeValueAsString(rp);
	}
	public static void main(String[] args) throws Exception{
		//make a body...
		Map paramMap = new HashMap();//传递body内容
		//paramMap.put("deviceuid","6091e0c2-65dd-e211-8c19-00163e0071c8");
		paramMap.put("keyWords","小苹果");
		// connect to server 
		String result = ConnUtil.sendPostZip(
				remoteServer, 
				"musicAll.get",//服务名
				jsonParam(paramMap), //拼接报文
				appKey, //appkey
				signKey//signKey
				);
		System.out.println("~~~~~~~~~~~~~~~"+result+"~~~~~~~~~~~~~~");
		// ret value verify
		try {
			ConnUtil.validRequestParam(result, signKey);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// body value analysis 
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(result);
		JsonNode headNode = jsonNode.get("head");
		JsonNode bodyNode = jsonNode.get("body");
		System.out.println("jsonNode:"+jsonNode);
		System.out.println("header:"+headNode);
		System.out.println("body:"+bodyNode);
	}
	

}
