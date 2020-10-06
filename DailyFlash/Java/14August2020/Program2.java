class Program{

	public static void main(String[] arg){

		int num1 = 10;
		int num2 = 2, gcd = 0;

		while(num2!=0){

			if(num1>num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}
		gcd = num1;
		System.out.println("GCD = "+gcd);
	}
}
