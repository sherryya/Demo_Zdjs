package com.itov.zdjs;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itov.bean.reqeustParam;
import com.itov.bean.requestHeader;
import com.itov.util.ConnUtil;

public class zdc_closeCarWindow {

	// �Ʒ���ƽ̨��ַ
    public static String remoteServer = "http://localhost:8098/sshop_zdc/";
	//public static String remoteServer = "http://125.211.221.231:10081/sshop/";
	// Ӧ����Կ
	public static String appKey = "sshop";
	// ����ǩ����Կ
	public static String signKey = "1qazxsw2";
	// ��˾��ʶ
	public static int appid = 1;
	// ��˾ƽ̨��ʶ
	public static int clientPlatform = 1;

	//
	/**
	 * Header����
	 * 
	 * @param param
	 * @return
	 */
	public static String jsonParam(Map param) throws Exception {

		requestHeader rh = new requestHeader();
		rh.setAppid(appid);
		rh.setCommand_id(1000);// �ͻ���ʹ��
		rh.setPlatform(clientPlatform);
		rh.setScreenX(1024);// �ն���Ļ�ߴ�-��
		rh.setScreenY(769);// �ն���Ļ�ߴ�-��
		rh.setTerm_id("111111");// �ն˱�ʶ
		rh.setTimestamp();// �ͻ���ʹ��
		rh.setUser_id(1);// (��ѡ)
		reqeustParam rp = new reqeustParam();
		rp.setHead(rh);
		rp.setBody(param);
		return new ObjectMapper().writeValueAsString(rp);
	}

	public static void main(String[] args) throws Exception {
		Map paramMap = new HashMap();// ����body����

		paramMap.put("Content","2E 81 01");
		paramMap.put("SendIP","liang4");
		paramMap.put("Type","1");
		paramMap.put("Server_IP","192.168.0.129");
		paramMap.put("Port","8005");
		String result = ConnUtil.sendPostZip(remoteServer,
				"closeCarWindow.get",//
				jsonParam(paramMap), // ƴ�ӱ���
				appKey, // appkey
				signKey// signKey
				);
		try {
			ConnUtil.validRequestParam(result, signKey);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// body value analysis
		ObjectMapper mapper = new ObjectMapper();
		// System.out.println("result:"+result);
		JsonNode jsonNode = mapper.readTree(result);
		JsonNode headNode = jsonNode.get("head");
		JsonNode bodyNode = jsonNode.get("body");
	//	System.out.println("jsonNode:" + jsonNode);
		//System.out.println("header:" + headNode);
		System.out.println("body:" + URLDecoder.decode(bodyNode.toString(),"UTF-8"));
		System.out.println( URLDecoder.decode((URLDecoder.decode(bodyNode.toString(),"UTF-8")),"UTF-8"));
	}
}
