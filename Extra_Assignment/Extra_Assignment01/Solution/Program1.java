/*
 * Problem Statement
 *
 * Write a program to show the min and max value of datatypes (Byte, Short, Integer, Long, Float, Double). (Refer Wrapper Class Methods)
 *
 * */

class MinMax {

	public static void main(String[] args){

		//Every Wrapper class contains 2 static variables which contains Minimum and Maximum value of the Corresponding Data Type

		System.out.println("Byte\t\tMinimum = "+Byte.MIN_VALUE+"\t\t\tMaximum = "+Byte.MAX_VALUE);
		System.out.println("Short\t\tMinimum = "+Short.MIN_VALUE+"\t\tMaximum = "+Short.MAX_VALUE);
		System.out.println("Integer\t\tMinimum = "+Integer.MIN_VALUE+"\t\tMaximum = "+Integer.MAX_VALUE);
		System.out.println("Long\t\tMinimum = "+Long.MIN_VALUE+"\tMaximum = "+Long.MAX_VALUE);
		System.out.println("Float\t\tMinimum = "+Float.MIN_VALUE+"\t\tMaximum = "+Float.MAX_VALUE);
		System.out.println("Double\t\tMinimum = "+Double.MIN_VALUE+"\t\tMaximum = "+Double.MAX_VALUE);
	}
}
