package com.day3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();//11
		int b=sc.nextInt();//30
		int sum,prod;
		while(a<=b) {
			//extraction of digit
			sum=(a%10)+(a/10);
			prod=(a%10)*(a/10);
			if(a==(sum+prod)) {
				System.out.println(a);
			}
			a++;
		}

	}

}
