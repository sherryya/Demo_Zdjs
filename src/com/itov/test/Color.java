package com.itov.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

enum tolor{
	RED , GREEN , YELLOW ;
}
public class Color{
public static void main(String[] args) {
	
	System.out.println(tolor.YELLOW);
	Random r = new Random();
    int t =  r.nextInt(899999)+100000;
    System.out.println(t);
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String date1 = sdf.format(date);
	String date2 = "2014-12-23";
	
	try {
		System.out.println(sdf.parse(date2).getTime()+"-----------"+sdf.parse(date1).getTime());
		if(sdf.parse(date2).getTime()>sdf.parse(date1).getTime())
		{
			System.out.println(111111);
		}else
		{
			System.out.println(22222222);
		}
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}

}
