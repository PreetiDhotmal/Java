/* Write java code for following pattern 

	C
	C G
	C G K
	C G K O
	C G K O S    */

class Pattern {

	public static void main(String[] args){

		for(int i=1; i<=5; i++){
			char ch = 'C';			
			for(int j=1; j<=i; j++){
				System.out.print(ch+" ");
				ch+=4;}
			System.out.println();		
		}
	}
}
