package syncronization;

public class ThreadClass extends Thread{
	
	TicketBooking b;
	int c;
	public ThreadClass(TicketBooking b,int a) {
		this.b=b;
		 c=a;
	}
	public void run() {
		b.book(c);
	}

}



