/* Take input from user using scanner class to print gmail account id
Input :
Enter string ID : Michelle
Enter numerical ID : 1234
Your email id is : Michelle1234@gmail.com  */

import java.util.*;

class Program {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string ID : ");
		String s1 = sc.next();
		System.out.print("Enter numerical ID : ");
		int num = sc.nextInt();

		System.out.println("Your email id is : "+s1+""+num+"@gamil.com");
	}
}
