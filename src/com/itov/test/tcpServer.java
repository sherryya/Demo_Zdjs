package com.itov.test;

import java.io.*; 
import java.net.*;
public class tcpServer {
	public static void main(String[] args) throws IOException
	{
		ServerSocket server = new ServerSocket(12301);
		Socket client = server.accept();
		BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream())); 
		PrintWriter out=new PrintWriter(client.getOutputStream()); 
		BufferedReader wt = new BufferedReader(new InputStreamReader(System.in)); 
		while(true)
		{
			String  str = in.readLine();
			System.out.println(str);
			String ttt = wt.readLine();
			out.println(ttt);
			//out.println("has receive");
			out.flush();
			if(str.equals("end"))
			{
				System.out.println("发送的数据已经结束");
				break;
			}
		}
		client.close();
	}
}
