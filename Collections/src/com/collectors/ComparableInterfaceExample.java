package com.collectors;

public class ComparableInterfaceExample implements Comparable<ComparableInterfaceExample> {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "ComparableInterfaceExample [id=" + id + ", name=" + name + "]";
	}
	public ComparableInterfaceExample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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
	public int compareTo(ComparableInterfaceExample o) {
		
		return id-o.getId();
	}
	

}
