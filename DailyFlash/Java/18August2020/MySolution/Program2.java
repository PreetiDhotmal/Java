/* Write a program to check whether the character is vowel or consonant
Input : E
Output : E is a Vowel
*/

class Program {

	public static void main(String[] args){

		char ch = 'E';
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println(ch+" is vowel");
		else
			System.out.println(ch+" is consonant");
	}
}
