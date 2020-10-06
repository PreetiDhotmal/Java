/*
Write a program to check that user is eligible for voting or not using ternary operator */

class TernaryOperator{

	public static void main(String[] args){

		int age = 18;
		String res = null;

		res = (age >= 18) ? "You are eligible" : "You are not eligible";
		System.out.println(res);
	}
}
