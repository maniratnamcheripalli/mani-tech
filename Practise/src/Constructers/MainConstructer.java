package Constructers;

public class MainConstructer {
	static int a;
	String b;
	 MainConstructer(int a,String b) {
		 System.out.println("Hello");
		 this.a=a;
		 this.b=b;
	}
	 MainConstructer() {
		 
	 }
	 void fun() {
		
		
		 System.out.println(a+" "+b);
	 }

	public static void main(String[] args) {
		
		
		MainConstructer ma=new MainConstructer(10,"Mani");
		ma.fun();
		MainConstructer ma1=new MainConstructer();
		ma1.fun();
		

	}

}
