package syncronization;


public class ThreadClas extends Thread{
		
		TicketBooking b;
		int c;
		public ThreadClas(TicketBooking b,int a) {
			this.b=b;
			 c=a;
		}
		public void run() {
			b.book(c);
		}

}


