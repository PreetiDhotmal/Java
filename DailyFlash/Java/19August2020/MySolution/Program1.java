/* Write a program to check whether the character is uppercase or lowercase character 
Input : v
Output : letter v is in lowercase
*/

class Program {

	public static void main(String[] args){

		char ch = 'v';

		if(ch >= 'a' && ch <= 'z')
			System.out.println("Letter "+ch+" is in lowercase");
		else if(ch >= 'A' && ch <= 'Z')
			System.out.println("Letter "+ch+" is in uppercase");
	}
}
