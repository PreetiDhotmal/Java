class Program{

	public static void main(String[] args){

		int num = 121, temp=0, rem=0;
		temp = num;
	
		while(num!=0){

			rem = rem*10 + num % 10;
			num = num / 10;
		}
		if(rem == temp)
			System.out.println(temp+" is palindrome");
		else
			System.out.println(temp+" is not palindrome");
	}
}
