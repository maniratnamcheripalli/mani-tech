package Composition;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		
		College c1=new College("vignan","Hyderabad");
		College c2=new College("Cvr","Hyderabad");
		College c3=new College("Jntuh","Hyderabad");
		List<College> college=new ArrayList<>();
		college.add(c3);
		college.add(c2);
		college.add(c1);
		University uni=new University(college);
		uni.display();
	}

}
