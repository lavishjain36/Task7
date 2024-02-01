package com.day2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//create a Scanner class object
		Scanner sc=new Scanner(System.in);
		//create variables
		float a,b,c,d,e;
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		d=sc.nextFloat();
		e=sc.nextFloat();
		
		//logic
		double avg=(a+b+c+d+e)/5.0;//30.0

	    DecimalFormat f = new DecimalFormat("##.00");
	    System.out.println(f.format(avg));

		
	}

}
