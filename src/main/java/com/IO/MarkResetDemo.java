package com.IO;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class MarkResetDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fr=new FileInputStream("a");
		byte [] buf=new byte[fr.available()];
		//FileReader
		fr.read(buf);
		fr.close();
		
		ByteArrayInputStream bis= new ByteArrayInputStream(buf);
		int charRead=3;
		bis.mark(charRead);
		byte[] cbuf=new byte[charRead];
		int len=bis.read(cbuf);
		System.out.println(Arrays.toString(cbuf));
		
		bis.reset();
		
		bis.read(cbuf);
		System.out.println(Arrays.toString(cbuf));
	}
}
