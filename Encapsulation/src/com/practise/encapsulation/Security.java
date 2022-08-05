package com.practise.encapsulation;

class Security {
	private int a=10;
	private int id;
	private String name;
	private String office="techouts"; //Read only we cannot change it
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOffice() {
		return office;
	}
}
