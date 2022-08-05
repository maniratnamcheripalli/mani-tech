package com.practise.constructer;

public class ConstructerOverloading {
	int id;
	String name;
	float salary;
	ConstructerOverloading(int x,String y,float z){
		id=x;
		name=y;
		salary=z;
	}
	
	ConstructerOverloading(int x,String y){
		id=x;
		name=y;	
	}
	void over() {
		System.out.println(id+" "+name+" "+salary+" ");
	}
	public static void main(String[] args) {
		ConstructerOverloading ob1=new ConstructerOverloading(1951,"Ramesh",5000f);
		ConstructerOverloading ob2=new ConstructerOverloading(1955,"Mani");
		ob1.over();
		ob2.over();

	}

}
