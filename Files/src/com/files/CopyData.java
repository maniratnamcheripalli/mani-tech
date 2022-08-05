package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyData {
	public static void main(String[] args) throws IOException {
		File file=new File("Writing","CopyFile");
		file.createNewFile();
		File file1=new File("Writing","FileWriter");
		File file2=new File("Writing","BufferedWriter");
		PrintWriter pw=new PrintWriter(new FileWriter(file));
		BufferedReader br1=new BufferedReader(new FileReader(file1));
		String i;
		while((i=br1.readLine())!=null) {
			pw.println(i);
		}
		br1.close();
		BufferedReader br2=new BufferedReader(new FileReader(file2));
		String j;
		while((j=br2.readLine())!=null) {
			pw.println(j);
		}
		br2.close();
		pw.close();	
	}

}
