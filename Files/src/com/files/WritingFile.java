package com.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingFile {

	public static void main(String[] args) throws IOException {
		File f=new File("Writing");
		f.mkdir();
		File file=new File(f,"FileWriter");
		file.createNewFile();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and employee id");
		String name=sc.nextLine();
		int id=sc.nextInt();
		FileWriter fw=new FileWriter(file);
		fw.write(name);
		fw.write("\n"+id);
		fw.flush();
		fw.close();
		
				
		
		
		

	}

}
