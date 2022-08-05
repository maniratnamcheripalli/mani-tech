package com.files;

import java.io.File;

public class HiddenFile {

	public static void main(String[] args) {
		File file=new File("Reader","FileReader");
		if(file.isHidden()) {
			System.out.println("File is hidden");
		}else
		{
			System.out.println("File is not hidden");
		}

	}

}
