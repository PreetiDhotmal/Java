/* Write a java program to print addition of 1 to 10 with 10 to 1 */
class Program {

	public static void main(String[] args){

		for(int x=10, j=1; j<=10; x--, j++){
			int ans = j + x;
			System.out.println("Ans = "+ans);
		}
	}
}
