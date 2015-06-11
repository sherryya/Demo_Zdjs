package com.itov.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("E:\\a.txt");
		InputStream is = new FileInputStream(file);
		OutputStream os = new FileOutputStream(file);
		if(-1!=is.read())
		{
			os.write(is.read());
			
		}
		//System.out.println();
		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
