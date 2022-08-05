package com.techouts.practise;

public class Test {

	public static void main(String[] args) {
		Address ad=new Address(5,"Hyderabad","Telangana");
		Student st=new Student(15, "Vijay",ad);
		st.met();
	}

}
