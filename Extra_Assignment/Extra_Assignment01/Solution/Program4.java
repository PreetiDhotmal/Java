/*
 * Problem Statement
 *
 * Write a program to convert primitive datatypes into Wrapper objects and show their binary and octal strings. (Refer Wrapper Class Methods)
 *
 * */

class Chess {

	public static void main(String[] args){

		//Convert primitive data type to Wrapper Object

		//Integer
		//Primitive Representation
		int square_cnt = 64;
		
		//Wrapper Class Object
		Integer sqr = new Integer(square_cnt);
		System.out.println(sqr);
		
		//Binary Representation
		System.out.println("Binary = "+Integer.toBinaryString(sqr));
		
		//Octal Representation	
		System.out.println("Octal = "+Integer.toOctalString(sqr));
	}
}
