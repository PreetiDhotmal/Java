class Program {

	public static void main(String[] args){

		int year = 2020;
		if(year % 4 == 0)
			if(year % 100 == 0)
				if(year % 400 == 0)
					System.out.println("Year is leap year");
				else
					System.out.println("Year is not leap year");
			else
				System.out.println("Year is leap year");
		else
			System.out.println("Year is not leap year");
	}
}
