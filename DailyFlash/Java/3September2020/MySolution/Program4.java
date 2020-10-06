/* Write a program to print following pattern

	1
	8   27
	64  125 216
	343 512 729 1000              */

class Program {

	public static void main(String[] args){

		for(int i=1,x=1; i<=4; i++){

			for(int j=1; j<=i; j++,x++){
				int val = x * x * x;
				if(val <= 10)
					System.out.print(val+"   ");
				else if(val>=10 && val<100)
					System.out.print(val+"  ");
				else
					System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}
