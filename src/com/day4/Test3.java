package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   
	  //no of rows as input
	   int rows=sc.nextInt();
	   //no of columns as input
	   int columns=sc.nextInt();
	   //input with tree number
	   int treenumber=sc.nextInt();
	   
	   //check the logic
	   if(treenumber<=rows||(treenumber-1)%columns==0||treenumber%columns==0) {
		   System.out.println("Mango tree");
	   }else {
		   System.out.println("Not a Mango tree");
	   }
	   
	   }

	

}
