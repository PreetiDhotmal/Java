/* Write a java program to print cubes of add numbers ranging between 1 to 50 */
class Program{

	public static void main(String[] args){

		for(int i=1; i<=50; i++)
			if(i % 2 !=0)
				System.out.println("Cube of "+i+" : "+i*i*i);  
	}
}
