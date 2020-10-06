/* Write a java program to take a number as input and print series of prime number from 1 
Input : 20
Output : 2 3 5 7 11 13 17 19 */

class Program {

	public static void main(String[] args){

		for(int i=2; i<20; i++){

			int flag = 0;
			for(int j=2; j<i; j++){

				if(i % j == 0)
					flag = 1;
			}
			if(flag == 0)
				System.out.println(i);
		}
	}
}
