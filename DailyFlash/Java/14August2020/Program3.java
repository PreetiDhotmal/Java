class Program{

	public static void main(String[] args){

		long num = 346697662;
		long rem=0, count=0,temp=0;

		temp = num;

		while(num!=0){

			rem = num % 10;
			if(rem == 6)
				count = count + 1;
			num = num / 10;
		}
		System.out.println("The occurrences of 6 is number "+temp+" is = "+count);
	}
}
