package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();//16
		float time=sc.nextFloat();//10.15
		if(age<13) {
			if(time==13.30) {
				System.out.println("$2.00");
			}else {
				System.out.println("$4.00");
			}
		}else {
			if(time>=13.30) {
				System.out.println("$5.00");
			}else {
				System.out.println("$8.00");
			}
		}
	}

}
