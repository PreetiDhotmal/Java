class Program2{

	public static void main(String[] args){

		int year = 3;

		switch(year){

			case 3:
				{

					int marks = 80;
					
					switch(marks){

						case 80:
							System.out.println("Student eligible for Education scholarship");
							break;
						default:
							System.out.println("Not eligible");
							System.out.println("Try next time");
							break;
					}
				}
				break;
			case 2:
			case 1:
				System.out.println("You are in 1st or 2nd year");
				System.out.println("Try this in 3rd year");
				break;
			default:
				System.out.println("Wrong choice");
		}
	}
}
