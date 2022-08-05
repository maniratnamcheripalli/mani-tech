package Composition;

import java.util.List;

public class University {
	
	List<College> college;

	public University(List<College> college) {
		super();
		this.college = college;
	}
	void display() {
		for(College cl:college) {
			System.out.println(cl.name+" "+cl.state);
		}
	}
	

}
