package com.itov.zdjs;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itov.bean.reqeustParam;
import com.itov.bean.requestHeader;
import com.itov.util.ConnUtil;

public class getUserUID {

	// 云服务平台地址
   //public static String remoteServer = "http://172.16.1.14:8189/zdc/";
//	public static String remoteServer = "http://localhost:8080/sshop_zdc/";
    //public static String remoteServer = "http://125.211.221.231:10189/zdc/";
//public static String remoteServer = "http://localhost:8080/sshop_yhw/";
//	public static String remoteServer = "http://125.211.221.231:10088/sshop_up/";
//	public static String remoteServer = "http://218.8.127.3:10189/zdc/";
	public static String remoteServer = "http://218.8.127.3:18006/sshop_yhw/";
	// 应用密钥
	public static String appKey = "sshop";
	// 内容签名密钥
	public static String signKey = "1qazxsw2";
	// 公司标识
	public static int appid = 1;
	// 公司平台标识
	public static int clientPlatform = 1;

	//
	/**
	 * Header配置
	 * 
	 * @param param
	 * @return
	 */
	public static String jsonParam(Map param) throws Exception {

		requestHeader rh = new requestHeader();
		rh.setAppid(appid);
		rh.setCommand_id(1000);// 客户端使用
		rh.setPlatform(clientPlatform);
		rh.setScreenX(1024);// 终端屏幕尺寸-宽
		rh.setScreenY(769);// 终端屏幕尺寸-高
		rh.setTerm_id("111111");// 终端标识
		rh.setTimestamp();// 客户端使用
		rh.setUser_id(1);// (可选)
		reqeustParam rp = new reqeustParam();
		rp.setHead(rh);
		rp.setBody(param);
		return new ObjectMapper().writeValueAsString(rp);
	}

	public static void main(String[] args) throws Exception {
		Map paramMap = new HashMap();// 传递body内容
		//paramMap.put("deviceId","123456789012");
		//paramMap.put("terminal_imei", null);
		//paramMap.put("startLimit", 0);
		
	   // paramMap.put("account_type", 1);
	 //	paramMap.put("phone", "15776486668");
	 //	 paramMap.put("sms_type","0");
	//   paramMap.put("pageSize", 100);
	//   paramMap.put("pageNum", 3);
		//String mpoint="45.74634,126.68618";
	 // paramMap.put("telphone", "18620202020" );
	     //paramMap.put("device_id", "33452tny");
	   //  paramMap.put("is_use", 1);
		 paramMap.put("account_name", "15114640000");
	    //paramMap.put("account_password", "111111");
	     /*  paramMap.put("account_role_id", "0");
	     paramMap.put("company_id", "0");
	     paramMap.put("nickname", "李建");
	     paramMap.put("real_name", "李建");
	     paramMap.put("person_sex", "男");
	     paramMap.put("person_tel", "13166666669");
	     paramMap.put("person_email", "666669@163.com");*/
	/*     
	    paramMap.put("city_code", "HAERBINI");
	    paramMap.put("car_color", "黑色");
	    paramMap.put("car_driving_license_date", "20150421");
	    paramMap.put("car_type", 3211);
		paramMap.put("car_plate_number", "黑A286K5");
	    paramMap.put("account_id", 721);
	    paramMap.put("car_carcase_num", "LFV2A11K3E4181695");
		paramMap.put("car_engine_num", "11111111");*/
	  //paramMap.put("car_name", "sherryTwo");
	 /*   paramMap.put("r", "8000");
		paramMap.put("city","哈尔滨");
		paramMap.put("address","金马大厦");
		paramMap.put("city_id", "哈尔滨市");*/
		//String push="";
		//paramMap.put("push_info", "{'play_url':'http://zhangmenshiting.baidu.com/data2/music/123861847/1228228671422496861.mp3?xcode=d23153821d94139ab67812dbf6202e1c043e61116c478493','songname':'烟火里的尘埃','artistname':'华晨宇'},{'play_url':'http://zhangmenshiting.baidu.com/data2/music/123861527/123193996187200.mp3?xcode=d23153821d94139ab67812dbf6202e1cb9a60be3acc448b9','songname':'卡西莫多的礼物','artistname':'华晨宇'},{'play_url':'http://zhangmenshiting.baidu.com/data2/music/123861854/122911544201600.mp3?xcode=d23153821d94139ab67812dbf6202e1c0c1e48935ca0eb42','songname':'Let You Go','artistname':'华晨宇'}");
		//paramMap.put("terminal_imei", "terminal_imei");
		//paramMap.put("version", "{\"carbrand\":\"carbrand\"}");
		
		//paramMap.put("deviceuid", "864581020016667");
		//paramMap.put("obd_code", "2E41050006030100AF#2E41040006045858#2E41040006053A75#2E4104000606802E#2E4104000607832A#2E410400060AFFAB#2E410400060B2C7D#2E410400060E7135#2E410400060F2E77#2E4104000611247F#2E4104000613039E#2E41050006145B80C4#2E41050006155AFF45#2E410500061F002074#2E4105000621000092#2E4105000623021F6F#2E410400062E0086#2E41040006300084#2E4105000631000082#2E4104000633651C#2E410500063C0D3A30#2E410500064238C871#2E4105000643005B15#2E41050006447D00F2#2E41040006450A65#2E41040006461E50#2E41040006472449#2E4104000648FF6D#2E410500064EFFFF67#2015-01-14 22:24:05");
		//paramMap.put("car_carcase_num", "VF1LZL4T4BC256716");
		
		//paramMap.put("account_id", 859);
	   
	     // paramMap.put("car_id", 410);
		//paramMap.put("terminal_imei", "222222222222");
		//paramMap.put("ter_type", "0");
		/*paramMap.put("latitude", "45.745466317331");
		paramMap.put("longitude", "126.68841788354");
		paramMap.put("radius", "6000");*/
	
		//paramMap.put("car_plate_num", "黑A286KC");
		//paramMap.put("city_name", "哈尔滨")
		/*paramMap.put("accountId", 2);
		paramMap.put("urCity", "哈尔滨市");
		paramMap.put("urCommunityId", 5);
		paramMap.put("urCounty", "南岗区");
		paramMap.put("urDeadline", "12");
		paramMap.put("urEntrustTerm", "");
		paramMap.put("urEntrustTime", "");
		paramMap.put("urLatitude", "45.745466317331");
		paramMap.put("urLongitude", "126.68841788354");
		paramMap.put("urLeaseMoney", 1);
		paramMap.put("urLeaseType", 3);
		paramMap.put("urLicensePlate", "");
		paramMap.put("urStatus", 0);
		paramMap.put("urReaseObject", 0);
		paramMap.put("urParkingUrl", "");
		paramMap.put("urParkingLot", "");
		paramMap.put("urOwnerTel", "13011111111");
		paramMap.put("urOwnerName", "万达小区");
		paramMap.put("urProvince", "黑龙江省");
		paramMap.put("urPunishmentMoney","");
		paramMap.put("urtitle", "新的车位小区");*/
				
	/*	paramMap.put("strlatlon", "");
		paramMap.put("strUser", "18646117093");
		paramMap.put("strTitle", "测试推行");
		paramMap.put("mMessage", "");
		paramMap.put("Msgtype","啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
		paramMap.put("Content", "啊啊啊啊啊啊啊啊啊啊啊啊啊！！！");
		paramMap.put("strType", "");
		paramMap.put("strNum", "");*/
		
		String result = ConnUtil.sendPostZip(remoteServer,
				//"carstarte.get",//
				"accountInfoByTel.get",
				//"breakrulesprocitylist.get",
				//"carHotLogin.get",//
				jsonParam(paramMap), // 拼接报文
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
		System.out.println("body:" + bodyNode);
	}
}
