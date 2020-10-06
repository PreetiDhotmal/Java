/* Write a program to take number of month and print the number of days in that month
Input : 4
Output : April is a 30 days's month
*/

class Program{

	public static void main(String[] args){

		int num = 4;
		switch(num){

			case 1:
				System.out.println("January is a 31 day's month");
				break;
			case 2:
				System.out.println("February is a 28 day's month");
				break;
			case 3:
				System.out.println("March is a 31 day's month");
				break;
			case 4:
				System.out.println("April is a 30 day's month");
				break;
			case 5:
				System.out.println("May is a 31 day's month");
				break;
			case 6:
				System.out.println("June is a 30 day's month");
				break;
			case 7:
				System.out.println("July is a 31 day's month");
				break;
			case 8:
				System.out.println("August is a 31 day's month");
				break;
			case 9:
				System.out.println("September is a 30 day's month");
				break;
			case 10:
				System.out.println("October is a 31 day's month");
				break;
			case 11:
				System.out.println("November is a 30 day's month");
				break;
			case 12:
				System.out.println("December is a 31 day's month");
				break;
			default:
				System.out.println("Wrong choice");
				break;
		}
	}
}
