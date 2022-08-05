package com.files;

import java.io.File;

public class ReadOnlyfFile {

	public static void main(String[] args) {
		File file=new File("Reader","FileReader");
		boolean flag=file.setReadOnly();
		if(flag==true) {
			System.out.println("Succesfully set as read only");
		}else {
			System.out.println("not set");
		}

	}

}
