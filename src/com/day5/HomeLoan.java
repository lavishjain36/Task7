package com.day5;

//Loan-Parent class
class Loan{
	//created constructor ->
	Loan(){
		System.out.println("Inside Loan..");
	}
}

//inheritance concepts of oops
public class HomeLoan extends Loan {
	//constructor
	HomeLoan(){
		super();//parent class constructor
		System.out.println("Home Loan constructor...");
	}

	public static void main(String[] args) {
		
     HomeLoan obj=new HomeLoan();//it wil constructor of Homeclass
	}

}

//A.)No output
//B.)Inside Loan
//C)Compiler error
//D)Runtime error
