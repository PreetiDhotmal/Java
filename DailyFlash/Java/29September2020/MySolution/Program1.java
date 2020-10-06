/* Store the score of cricket player in an integer array and print the total score of team */

class Program {

	public static void main(String[] args) {
	
		int iarray[]={12,34,56,78,65}, sum=0;
		for(int i=0; i<5; i++){
			sum = sum + iarray[i];
		}
		System.out.println("Total score = "+sum);
	}
}
