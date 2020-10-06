/* Take hardcoded information as a string for eg. String one "SWARUP,A,2,324.2", string second "SONIA,C,23,522.05".print info at new line, use "for","while loop"for SONIA
Expected output : 
SWARUP
D
25
324.2 */

import java.util.*;

class Program {

	public static void main(String[] args){

		String str1 = "SWARUP,A,2,324.2";
		String str2 = "SONIA,C,23,522.05";
		
		StringTokenizer st1 = new StringTokenizer(str1,",");
		StringTokenizer st2 = new StringTokenizer(str2,",");
		
		for(int i=1; i<=4; i++){

			String token1 = st1.nextToken().trim();
			System.out.println(token1);
		}
		for(int i=1; i<=4; i++){

			String token2 = st2.nextToken().trim();
			System.out.println(token2);
		}
	}
}
