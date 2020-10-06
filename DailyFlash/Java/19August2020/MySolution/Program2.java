/* Write a program to take a interger ranging between 0 to 6 and print corresponding weekday
Input : 2
Output : Wednesday
*/

class Program {

	public static void main(String[] args){

		int num = 2;
		switch(num){

			case 0:
				System.out.println("Monday");
				break;
			case 1:
				System.out.println("Tuesday");
				break;
			case 2:
				System.out.println("Wednesday");
				break;
			case 3:
				System.out.println("Thusday");
				break;
			case 4:
				System.out.println("Friday");
				break;
			case 5:
				System.out.println("Saturday");
				break;
			case 6:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Wrong choice");
				break;
		}
	}
}
