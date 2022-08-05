package com.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Time;
public class FileReaders {

	public static void main(String[] args) throws IOException {
		File f=new File("Reader");
		f.mkdir();
		File file=new File(f,"FileReader");
		file.createNewFile();
		FileWriter fw=new FileWriter(file,true);
		PrintWriter pw=new PrintWriter(fw);
		pw.println("Mani");
		pw.println("College: Vignan");
		pw.println("18891A0115");
		pw.println(10);
		pw.println(30);
		pw.append('a');
		pw.flush();
		pw.close();
		fw.close();
		FileReader fr=new FileReader(file);
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
		Date da=new Date(file.lastModified());
		System.out.println("Last "+da);
		Time t=new Time(file.lastModified());
		System.out.println("Last "+t);
		
	}

}
