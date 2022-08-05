package com.practise.inher;

class Employ{
	int id;
	String name;
	
}
class Manager extends Employ{
	int salary;
	void fun2() {
		salary=10000;
		System.out.print(salary+ " "+id+" "+name);
	}
}

public class SingleInheritance{

	public static void main(String[] args) {
		Manager ma=new Manager();
		ma.id=100;
		ma.name="Rajesh";
		ma.fun2();
		

	}

}



