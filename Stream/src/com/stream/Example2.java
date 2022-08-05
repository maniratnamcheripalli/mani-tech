package com.stream;

public class Example2 {
	int id;
	private float salary;

	public Example2(int id, float salary) {
		super();
		this.id = id;
		this.setSalary(salary);
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
}
