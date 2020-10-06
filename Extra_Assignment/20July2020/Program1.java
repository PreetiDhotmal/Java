class Bitwise{

	public static void main(String[] args){

		int x = 10;
		int y = 20;

		double a = 23.3;
		double b = 20.5;

		long p = 200;
		long q = 198;

		double ans = 0;

		ans = x & y;
		System.out.println("Ans = "+ ans);	//0

		ans = x | y;
		System.out.println("Ans = "+ ans);	//30

		ans = x ^ y;
		System.out.println("Ans = "+ ans);	//30



		ans = a & b;				//we can't use this operator with float
		System.out.println("Ans = "+ ans);	

		ans = a | b;				//we can't use this operator with float
		System.out.println("Ans = "+ ans);

		ans = a ^ b;				//we can't use this operator with float
		System.out.println("Ans = "+ ans);



		ans = a & b;				//we can't use this operator with double
		System.out.println("Ans = "+ ans);

		ans = a | b;				//we can't use this operator with double
		System.out.println("Ans = "+ ans);

		ans = a ^ b;				//we can't use this operator with double
		System.out.println("Ans = "+ ans);



		ans = a & b;				
		System.out.println("Ans = "+ ans);	//64

		ans = a | b;				
		System.out.println("Ans = "+ ans);	//67

		ans = a ^ b;				
		System.out.println("Ans = "+ ans);	//3



		ans = p & q;				
		System.out.println("Ans = "+ ans);	//192

		ans = p | q;				
		System.out.println("Ans = "+ ans);	//206

		ans = p ^ q;				
		System.out.println("Ans = "+ ans);	//14


	}
}


/*
we can use interger numbers for bitwise operators and we can use character because internally character converts in integer using ascii values and also we can use long 

But we cant use float and double for bitwise operators
*/
