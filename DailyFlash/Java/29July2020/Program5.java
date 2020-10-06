class EvenOdd{

	static boolean isEven(int num){

		boolean flag;
		flag = ((num >> 2)<<2)==num;
		return flag;
	}

	public static void main(String[] args){
	
		boolean result;

		result = isEven(100);

		if(result == true){

			System.out.println("Even");
		}else{

			System.out.println("odd");
		}
	}
}
