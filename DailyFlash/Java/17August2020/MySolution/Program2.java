/* Write a program to check whether the number ins negative positive or equal to zero
Input : -2
Output : -2 is the negative number
*/

class Program {

	public static void main(String[] args){

		int num = -2;
		if(num>0)
			System.out.println(num+" is positive");
		else if(num<0)
			System.out.println(num+" is negative");
		else
			System.out.println(num+" is equal");
	}
}
