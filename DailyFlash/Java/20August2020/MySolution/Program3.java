/* Write a program to check if a year is leap year or not.{Note : If a year is divisible by 4 then it is leap year but if the year is century year like 2000,1900,2100 then it must be divisible by 400}*/

class Program {

	public static void main(String[] args){

		int year = 2020;
		if(year / 4 == 0){

			System.out.println(year+" is leap year");
		}else if(year / 2 == 0 && year / 400 == 0){

			System.out.println(year+" is leap year");
		}else{

			System.out.println(year+" is not a leap year");
		}
	}
}
