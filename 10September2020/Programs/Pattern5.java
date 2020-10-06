/*
	1
	4  9
	16 25 36
	49 64 81 100
*/

class Pattern {

	public static void main(String[] args){

		int val = 1;
		for(int i=1,num=1; i<=4; i++){

			for(int j=1; j<=i; j++){
				
				if(val*2<10)
					System.out.print((val*2)+"  ");
				else if(val*2<100)
					System.out.print((val*2)+" ");
				else
					System.out.print((val*2)+" ");
				val++;
			}System.out.println();
		}
	}
}
