/* Write a program that print series of perfect numbers up to the entered limiting number
Input : 100
Output : The series of all perfect number from 1 to 10 is 1, 6, 28     */

class Program {
	
	public static void main(String[] args){

		System.out.print("The series of all perfect number from 1 to 10 is 1 ");
		for(int i=1; i<=100; i++){
		
			int sum = 0;
			for(int j=1; j<i; j++){
				if(i % j == 0)
			       		sum = sum + j;
			}
			if(sum == i)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
