package com.day3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//create scanner class object
	 Scanner sc=new Scanner(System.in);
		//need to read the size of the array
	 int n=sc.nextInt();//5
		//create a memory to store 5 values
	 int[] arr=new int[n];//5 elements
	   //loop to store the 5 values
	   for(int i=0;i<n;i++) {
		   arr[i]=sc.nextInt(); //2 3 8 6 1
	   }
	   
	   //Logic part
	   int max=0;
	   for(int i=0;i<n;i++) {
		   if(arr[i]>max) {
			   max=arr[i];//update max value
		   }
	   }
	   System.out.println(max+" is the maximum element in the array");
	}

}
