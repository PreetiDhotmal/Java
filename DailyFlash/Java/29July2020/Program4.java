class Divisible{

	static boolean isDivisible(int dividend, int divisor){

		boolean flag;
		flag = ((dividend >> divisor) << divisor) == dividend;
		return flag;
	}

	public static void main(String[] args){

		boolean result;
		result = isDivisible(8,2);

		if(result == true){

			System.out.println("Yes");
		}else{

			System.out.println("No");
		}
	}
}
