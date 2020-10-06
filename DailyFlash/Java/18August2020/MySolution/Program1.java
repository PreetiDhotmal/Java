/* Write a program to check whether the character is alphabet or not 
Input : v
Output : v is an alphabet
*/

class Program {

	public static void main(String[] args){

		char ch = 'v';
		if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			System.out.println(ch+" is vowel");
		else
			System.out.println(ch+" is an alphabet");
	}
}
