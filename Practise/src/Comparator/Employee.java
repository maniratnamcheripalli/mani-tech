package Comparator;

public class Employee implements Comparable<Employee> {
	String name;
	int id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return name+" "+id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}
	

}
