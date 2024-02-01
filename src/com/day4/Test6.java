package com.day4;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Take input from user as String
		String s=sc.nextLine();
		int starcount=0;
		int hashcount=0;
		
		//count the number of * and # 
		for(char ch:s.toCharArray()) {
			if(ch=='*') {
				starcount++;
			}else {
				hashcount++;
			}
		}
		//calculate the difference of * and #
		int result=starcount-hashcount;
		System.out.println(result);

	}

}
