package com.day4;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=6;
		int diff=5;
		for(int i=1;i<=n;i++) {
			System.out.printf(s+" ");
			s=s+diff;//6+5
			diff=diff+5;//15
		}
	}
}
