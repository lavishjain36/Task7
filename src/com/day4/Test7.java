package com.day4;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//size of the array
		int n=sc.nextInt();
		//take array elements that using size
		int[] arr=new int[n];
		//loop mechanism
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//count the elements greater than all of its prior elements.
		int count=1;//first element
		int maxsofar=arr[0];
		
		for(int i=1;i<n;i++) {
			//checking if any element greater than 1st element,
//			increment the count by +1
			if(arr[i]>maxsofar) {
				count++;
				maxsofar=arr[i];
			}
		}
     	System.out.println(count);

	}

}
