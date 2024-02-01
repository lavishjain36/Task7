package com.day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   //accept ->total number of vehicle
	   int totalvehicles=sc.nextInt();//200
	   //accept->total of number of wheels
	   int totalwheels=sc.nextInt();//540
	   
	   //constraint
	   if(totalwheels<2||totalwheels%2!=0||totalvehicles>=totalwheels) {
		   System.out.println("Invalid input");
	   }else {
//		   the numbe rof tw and fw
		   int tw=(4*totalvehicles-totalwheels)/2;//130
		   int fw=totalvehicles-tw;//70
		   
		   System.out.println("Tw:" +tw+ "and FW:"+fw);
	   }

	}

}
