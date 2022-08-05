package com.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Creating {
	public static void main(String[] args) throws IOException {
		// 1st way
		File f=new File("First.txt");
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		f.delete();
		
		//2nd way
		Path pa=Paths.get("D:\\Mani\\Files\\second.txt");
		Path p=Files.createFile(pa);
		
	}

}
