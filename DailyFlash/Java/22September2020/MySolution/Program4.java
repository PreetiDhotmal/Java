/* Print following pattern
	1
       2 2
      3   3
     4     4   */

class Program {

	public static void main(String[] args){

		for(int i=1; i<=4; i++){
			int num = i;
			for(int j=1; j<=8; j++)
				if(j+i==5 || j-i==3)
					System.out.print(num+" ");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
}
