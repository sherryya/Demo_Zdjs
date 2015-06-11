package com.itov.zdjs;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itov.bean.reqeustParam;
import com.itov.bean.requestHeader;
import com.itov.util.ConnUtil;


public class GetGPSInfo {
	
	//�Ʒ���ƽ̨��ַ
	public static String remoteServer = "http://222.171.242.178:10081/sshop/";
	//Ӧ����Կ
	public static String appKey = "sshop";
	//����ǩ����Կ
	public static String signKey = "1qazxsw2";
	//��˾��ʶ
	public static int appid = 1;
	//��˾ƽ̨��ʶ
	public static int clientPlatform = 1;
	//
	//public static String remoteServer = "http://localhost:8098/sshop_dev/";
	/**
	 * Header����
	 * @param param
	 * @return
	 */
	public static String jsonParam(Map param) throws Exception{
		
		requestHeader rh = new requestHeader();
		rh.setAppid(appid);
		rh.setCommand_id(1000);//�ͻ���ʹ��
		rh.setPlatform(clientPlatform);
		rh.setScreenX(1024);//�ն���Ļ�ߴ�-��
		rh.setScreenY(769);//�ն���Ļ�ߴ�-��
		rh.setTerm_id("111111");//�ն˱�ʶ
		rh.setTimestamp();//�ͻ���ʹ��
		rh.setUser_id(1);//(��ѡ)
		reqeustParam rp = new reqeustParam();
		rp.setHead(rh);
		rp.setBody(param);
		return new ObjectMapper().writeValueAsString(rp);
	}
	

	public static void main(String[] args) throws Exception{
		//make a body...
		Map paramMap = new HashMap();//����body����
		//paramMap.put("deviceuid","6091e0c2-65dd-e211-8c19-00163e0071c8");
		paramMap.put("deviceuid","283FF47D-43EF-62BC-4339-51684F1A0302");
		paramMap.put("date", "2014-08-19");
		paramMap.put("starttime", "00:00:56");
		paramMap.put("endtime", "18:48:32");
		// connect to server 
		String result = ConnUtil.sendPostZip(
				remoteServer, 
				"zdjs.gpsinfo.get",//������
				jsonParam(paramMap), //ƴ�ӱ���
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
