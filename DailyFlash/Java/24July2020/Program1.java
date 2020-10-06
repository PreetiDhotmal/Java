class EvenOdd{

	int num = 10;

	int evenOdd(int num){

		if(num % 2 == 0){

			System.out.println("Number is even");
		}else{

			System.out.println("Number is odd");
		}

		return 0;
	}

	public static void main(String[] args){

		EvenOdd obj = new EvenOdd();

		obj.evenOdd(12);
	}
}
