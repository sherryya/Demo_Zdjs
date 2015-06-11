package com.itov.test;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st ="250515";
		System.out.println(st.length());
		System.out.println(st.getBytes());
		char []ch =  st.toCharArray();
		//byte b[] = st.getBytes();
		for(int i=0;i<ch.length;i++)
		{
			st = st+ch[i];
			System.out.println(ch[i]);
			String stime = ""+ch[4]+ch[5]+ch[2]+ch[3]+ch[0]+ch[1];
			System.out.println(stime);
		}
		System.out.println(st);
		
		
	}

}
