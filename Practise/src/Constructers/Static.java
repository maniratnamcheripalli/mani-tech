package Constructers;

public class Static {
	static int a=0;
	static void fun() {
		a=5;
	}
	static{
		System.out.println("static");
		
		 for(int i=0; i<5;i++) {
			 a=a+i;
		 }
		 System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Static s=new Static();
		s.fun();
		Static s1=new Static();
		
	}

}
