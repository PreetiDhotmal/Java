class Program {

	public static void main(String[] args){

		int num = 10, sum=0, squ=0;
		squ = num * num;
		while(squ!=0){

			sum = sum + squ % 10;
			squ = squ / 10;
		}
		if(sum == num)
			System.out.println(num+" is neon number");
		else
			System.out.println(num+" is not neon number");
	}
}
