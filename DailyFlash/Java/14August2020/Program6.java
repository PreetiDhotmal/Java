class Program{

	public static void main(String[] args){

		int val = 6,sum=0;
		for(int i=1; i<6; i++){

			if(val % i == 0)
				sum = sum + i;
		}
		if(sum == val)
			System.out.println(val+" is perfect number");
		else
			System.out.println(val+" is not a perfect number");
	}
}
