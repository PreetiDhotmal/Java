/* Write a program to calculate simple interest taking all essential terms to compute as input */

class Program {

	public static void main(String[] args){

		int p = 5000, r = 15, t = 5,s;
		System.out.println("Principal Amount(p) = "+p);
		System.out.println("Interest Rate(r) = "+r);
		System.out.println("Term(Years)(t) = "+t);

		s = (p*r*t)/100;
		System.out.println("Simple interest = "+s);
	}
}
