/*
 * Problem Statement
 *
 * Write a program to get a binary, octal and hexdecimal representation of numbers - 10, 18, 5, 20. (Refer Wrapper Class Methods)
 *
 * */

class Conversions {

	public static void main(String[] args){

		System.out.println("For Decimal Number 10");

		//Converting Decimal to Binary using static method of Integer Wrapper Class
		System.out.println("Binary = \t"+Integer.toBinaryString(10));

		//Converting Decimal to Hexadecimal using static method of Integer Wrapper Class
		System.out.println("Hexadecimal = \t"+Integer.toHexString(10));

		//Converting Decimal to Octal using static method of Integer Wrapper Class
		System.out.println("Octal = \t"+Integer.toOctalString(10));
		System.out.println();

		System.out.println("For Decimal Number 18");
		System.out.println("Binary = \t"+Integer.toBinaryString(18));
		System.out.println("Hexadecimal = \t"+Integer.toHexString(18));
		System.out.println("Octal = \t"+Integer.toOctalString(18));
		System.out.println();

		System.out.println("For Decimal Number 5");
		System.out.println("Binary = \t"+Integer.toBinaryString(5));
		System.out.println("Hexadecimal = \t"+Integer.toHexString(5));
		System.out.println("Octal = \t"+Integer.toOctalString(5));
		System.out.println();

		System.out.println("For Decimal Number 20");
		System.out.println("Binary = \t"+Integer.toBinaryString(20));
		System.out.println("Hexadecimal = \t"+Integer.toHexString(20));
		System.out.println("Octal = \t"+Integer.toOctalString(20));
		System.out.println();

	}
}
