/* write a program to find whether the character is an alphabet, a digit or a special character
Input : *
Output : * is a special character
*/

class Program {

	public static void main(String[] args){

		int ch = '*';
		if(ch >= 'A' && ch <='Z' || ch >= 'a' && ch <='z')
			System.out.println("It is an alphabet");
		else if(ch == '*' || ch == '/' || ch=='+' || ch=='-')
			System.out.println("It is a special character");
		else if(ch >= '0' && ch <= '9')
			System.out.println("It is a digit");
	}
}
