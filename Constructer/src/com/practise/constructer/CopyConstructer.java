package com.practise.constructer;

public class CopyConstructer {
	//Copy values from one object to another object using constructer
	int id;
	String name;
	CopyConstructer(int a,String b){
		id=a;
		name=b;
	}
	CopyConstructer(CopyConstructer s){
		id=s.id;
		name=s.name;
		
	}
	void copy() {
		System.out.println(id+" "+name+" ");
	}

	public static void main(String[] args) {
		CopyConstructer cp1=new CopyConstructer(10,"Rahul");
		CopyConstructer cp2=new CopyConstructer(cp1);
		cp1.copy();
		cp2.copy();
		Ball cp3=new Ball(25,"Vinay");
		Ball cp4=new Ball();
		cp4.u=cp3.u;
		cp4.v=cp3.v;
		cp3.method();
		cp4.method();
		

	}

}
//coping values from one object to another object without constructer
class Ball{
	int u;
	String v;
	Ball(int c,String d){
		u=c;
		v=d;
				
	}
	Ball(){
	}
	void method() {
		System.out.println(u+" "+v+" ");
	}
}
