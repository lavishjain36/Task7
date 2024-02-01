package com.day2;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//791
		
//		0-9
		if(n<=9) {
			System.out.println("Not a Trendy Number");
		}else {
			int middl=(n/10);//79
			int rem=middl%10;//9
			if(rem%3==0) {
				System.out.println("Trendy Number");
			}else {
				System.out.println("Not a Trendy Number");
			}
	}

	}

}
