/*
 * Problem Statement
 *
 * Write a program to get a binary representation of number (refer que. 2) for numbers) and also replace all 0's in binary representaion with spaces. (Refer Wrapper Class Methods)
 *
 * */

class BinaryOperations{

	public static void main(String[] args){

		System.out.println("For Decimal Number 10");

		System.out.println("Binary = \t\t\t"+Integer.toBinaryString(10));
		
		/*
		 * Convert the base 10 (Decimal/Integer) Value to the Binary String using static method "toBinaryString" of Integer Wrapper Class 
		 * Return Type - String, Input Parameter - Decimal Value
		 * Store the Output in a String Variable
		 * */
		
		String bin10 = Integer.toBinaryString(10);
		
		/*
		 * Use the "replace" method (non-static) of String Class to replace the '0' by ' '
		 * Return Type - String, Input Parameter - char to be replaced, char to be replaced by
		 * */

		System.out.println("After Replacing 0s by Spaces \t"+bin10.replace('0',' '));
		System.out.println();


		System.out.println("For Decimal Number 18");
		System.out.println("Binary = \t\t\t"+Integer.toBinaryString(18));
		String bin18 = Integer.toBinaryString(18);
		System.out.println("After Replacing 0s by Spaces \t"+bin18.replace('0',' '));
		System.out.println();

		System.out.println("For Decimal Number 5");
		System.out.println("Binary = \t\t\t"+Integer.toBinaryString(5));
		String bin5 = Integer.toBinaryString(5);
		System.out.println("After Replacing 0s by Spaces \t"+bin5.replace('0',' '));
		System.out.println();

		System.out.println("For Decimal Number 20");
		System.out.println("Binary = \t\t\t"+Integer.toBinaryString(20));
		String bin20 = Integer.toBinaryString(20);
		System.out.println("After Replacing 0s by Spaces \t"+bin20.replace('0',' '));
		System.out.println();

	}
}
