package com.uday;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilesReadAndWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Uday\\OneDrive\\Desktop\\file1.txt";
		
		try {
			
			//we can use ExtendedOpenOption also
			Files.writeString(Path.of(path), "added data at last", StandardOpenOption.APPEND);
			String data=Files.readString(Path.of(path));
			
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
