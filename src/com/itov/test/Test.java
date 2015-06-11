package com.itov.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {/*
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int[] arr={2,3,5,7,9,43};
		System.out.println("请输入你要插入的数值");
		int number=in.nextInt();
		int i=0;
		arr[i]=number;
		System.out.println(arr+"---"+arr.length);
		for(int j=0;j<arr.length-1;j++){
			if(arr[j+1]>arr[j]){
			int t=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=t;
			}
		}
		for(int a=0;a<arr.length;a++){
			System.out.println(arr[a]);
		}

		
		String s = "ert;you;p;";
		System.out.println(s.indexOf(";", s.indexOf(";")+1));
		System.out.println(s.substring(s.indexOf(";")+1, s.indexOf(";", s.indexOf(";")+1)));
		String []arr = s.split(";");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+arr.length);
		}
		//
		Collection c = new ArrayList();
		c.add(6);
		c.add("12334");
		int [][]a = new int[2][3];
		int []aa = {1,2,3};
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdff =new SimpleDateFormat("yyyyMMddHHmmss");
	    try {
			System.out.println("--->>"+sdf.parse("2014-08-22 12:23:22"));;
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(Long.parseLong("20141124234730")-Long.parseLong("20141124234630"));
		try {
			Date dd = sdff.parse("20141124234730");
			Date d2 = sdff.parse("20141124234630");
			System.out.println(dd+"----"+d2);
			System.out.println(dd.getTime()-d2.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(ss);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.println(200%60);
			}
		}
		
		String tt = "VF1LZL4T4BC256702";
		System.out.println("---->>"+tt.length());
		int num = 6;
		
		String str = tt.substring(tt.length()-num, tt.length());
		System.out.println("str--->>"+str);
	*/
	/*String tt = "2E41020501B6#2015-01-09 07:55:32;";
	String str = tt.substring(0, 12);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String nowtime = sdf.format(new Date());
	String str1 = "2E41020500B7#"+nowtime+";";
	System.out.println(tt.length()+"----"+str1);*/
	/*	
		String a = "fd";
		int b = Integer.parseInt(a, 16);
		String tt="2E4104000606802E";
		if(null!=tt.substring(3, 5)&&!"".equals(tt.substring(3, 5)))
		{
			System.out.println(tt.substring(3, 5));
		}
		double dd = 23*100.0/128-64;  //根据公式计算的结果
		String trr = "11010010";
		System.out.println(dd);*/
		//double tt =14.992;
		//System.out.println((int)tt);
		int num =16;
		switch(num){
		case 1:
			System.out.println(1);
			break;
		case 16:
			System.out.println(16);
			break;
		case 10:
		     System.out.println(10);
		     break;
		}
	
	}

}
