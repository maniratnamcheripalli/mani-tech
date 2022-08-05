package syncronization;

public class TicketBooking {
	
	static int a=10;

//	public TicketBooking(int a) {
//		super();
//		this.a = a;
//	}
	static synchronized void book(int b) {
		if(a>=b) {
			System.out.println(b+" your tickets are booked");
			a=a-b;
		}else {
			System.out.println("only "+a+" are left");
		}
	}

}
