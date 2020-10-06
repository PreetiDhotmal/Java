/* Write a program that takes angle of a triangle from user and print whether that triangle is valid or not.
{Note : Addition of angle of triangle has to be 180 in order to consider it as a valid one}
Input : 30 60 70
Output : The triangle with angle 30, 60 & 70 is a invalid one
*/

class Program {

	public static void main(String[] args){

		int angle1 = 30, angle2 = 60, angle3 = 70;
		if(angle1 + angle2 + angle3 == 180)
			System.out.println("The triangle with angle "+angle1+", "+angle2+" & "+angle3+" is a valid one");
		else
			System.out.println("The triangle with angle "+angle1+", "+angle2+" & "+angle3+" is a invalid one");
	}
}
