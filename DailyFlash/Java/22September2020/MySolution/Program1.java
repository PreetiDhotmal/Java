/* Take a class name IPLTeam, declare instance variable as String teamName; String captain, int jerseyNum, String franchiseOwner, int countOfTrophiesWon; Now inside main() method take input from user make object of IPLTeam class, and assign each variable a respective value and print them...
Input : Enter team name : MI
	Enter captain name : Rohit Sharma
	Enter jersey number of Rohit Sharma : 45  */

import java.io.*;

class IPLTeam{

	String teamName;
	String captain;
	int jerseyNum;
	String franchieseOwner;
	int countOfTrophiesWon;

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter team name = ");
		String string1 = br.readLine();
		System.out.print("Enter captain name = ");
		String string2 = br.readLine();
		System.out.print("Enter jersey number = ");
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);
		System.out.print("Enter franchiese Owner name = ");
		String string3 = br.readLine();
		System.out.print("Enter count of trophies won = ");
		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		IPLTeam obj1 = new IPLTeam();
		obj1.teamName = string1;
		obj1.captain = string2;
		obj1.jerseyNum = num1;
		obj1.franchieseOwner = string3;
		obj1.countOfTrophiesWon = num2;

		System.out.println("\nTeam name is "+obj1.teamName);
		System.out.println("Captain name is "+obj1.captain);
		System.out.println("Jersey number is "+obj1.jerseyNum);
		System.out.println("franchiese Owner name is "+obj1.franchieseOwner);
		System.out.println("count Of Trophies Won is "+obj1.countOfTrophiesWon);
	}
}
