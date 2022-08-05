package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee("mani",1953));
		list.add(new Employee("raj",1950));
		//Collections.sort(list,new Name());
	//	System.out.println(list);
		Collections.sort(list);
		for(Employee e:list) {
			System.out.println(e);
		}
		
	}

}
