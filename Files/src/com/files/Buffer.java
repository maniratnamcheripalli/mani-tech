package com.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Buffer {

	public static void main(String[] args) throws IOException {

		File file1 = new File("Writing", "BufferedWriter");
//		file1.createNewFile();
//
		FileWriter fw = new FileWriter(file1, true);
//		fw.write("****FileWriter***");
//		fw.write("10");
//		fw.write("\nTechouts");
//		char[] c = { 'M', 'A', 'N', 'I' };
//		fw.write(c);
//		BufferedWriter bw = new BufferedWriter(fw);
//		bw.newLine();
//		bw.write("***BufferedWriter***");
//		bw.newLine();
//		bw.write("10");
//		bw.newLine();
//		bw.write("String");
//		bw.flush();
//		bw.close();
//		fw.close();		
		File file2=new File("Writing","PrintWriter");
		file2.createNewFile();
		PrintWriter pw=new PrintWriter(file2);
		pw.println("Mani");
		pw.println("College: Vignan");
		pw.println("18891A0115");
		pw.println(10);
		pw.flush();
		pw.close();
		fw.close();
		
	}

}
