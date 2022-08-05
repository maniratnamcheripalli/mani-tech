package com.practise.mani;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		int a;
		String month = null;
		System.out.println("Enter Number between 1 to 5");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		switch(a) {
		case 1: month="January";
		break;
		case 2: month="Feb";
		break;
		case 3: month="March";
		break;
		case 4: month="April";
		break;
		case 5: month="May";
		break;
		default: System.out.println("You entered out of limit");
		
		
		}
		System.out.println(month);

	}

}
