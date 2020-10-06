/* Take number of overs from user. Calculate the total number of balls by the value of total overs and create an array of runs of size of calculated number of total ball(ie. if overs are 2 then take array of size 12). Take runs from the user. Then print the following :
1. total score
2. total number of balls
3. total number of sixes(ie. 6)
4. total number of fours(ie. 4)
5. total number of others(ie. 1,2 or 3)
6. total number of dotBalls(ie. no run) */

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of overs = ");
		int over = sc.nextInt();

		int ball = over * 6;
		int[] run = new int[ball];
		int count1=0, count2=0, count3=0, count4=0, sum=0;

		for(int i=0; i<ball; i++)
			run[i] = sc.nextInt();

		for(int i=0; i<ball; i++)
			sum = sum + run[i];

		for(int i=0; i<ball; i++)
			if(run[i] == 6)
				count1++;
			else if(run[i] == 4)
				count2++;
			else if(run[i] == 1 || run[i] == 2 || run[i] == 3)
				count3++;
			else if(run[i] == 0)
				count4++;

		System.out.println("Total score = "+sum);
		System.out.println("Total number of balls = "+ball);
		System.out.println("Total Number of sixes = "+count1);
		System.out.println("Total Number of fours = "+count2);
		System.out.println("Total Number of others = "+count3);
		System.out.println("Total Number of dotBalls = "+count4);
	}
}

