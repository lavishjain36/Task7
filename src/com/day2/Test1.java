package com.day2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float value=sc.nextFloat();
//		System.out.println(Math.floor(f));
//		System.out.println(Math.round(f));
//		System.out.println(Math.ceil(f));
		int integervalue=(int)value;
		System.out.println(integervalue);
		
		int higestvalue=(int)Math.ceil(value);
		System.out.println(higestvalue);

		//typecasting
		int lowestvalue=(int)Math.floor(value);
		System.out.println(lowestvalue);
	}

}
