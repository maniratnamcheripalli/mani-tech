package syncronization;

public class MainClass {
	public static void main(String[] args) {
		TicketBooking tb=new TicketBooking();
		ThreadClass tc=new ThreadClass(tb,7);
		tc.start();
		
		ThreadClass tc1=new ThreadClass(tb,4);
		tc1.start();
		TicketBooking tb1=new TicketBooking();
		ThreadClas t=new ThreadClas(tb1, 3);
		t.start();
	}

}
