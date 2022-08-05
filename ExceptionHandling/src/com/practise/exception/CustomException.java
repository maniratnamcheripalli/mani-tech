package com.practise.exception;

public class CustomException {
	static void validate(int age) throws InvalidAgeException  {
		if(age<18) {
			throw new InvalidAgeException("Invalid age");
		}
		else {
			System.out.println("valid age");
		}
	}
	public static void main(String[] args) {
		CustomException ce=new CustomException();
		try {
			ce.validate(13);
		}catch(Exception e){
			System.out.println("Handeled");
		}
	}

}
