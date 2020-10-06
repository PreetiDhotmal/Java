import java.io.*;

class Program {

	public static void main(String[] args){

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Team Name = ");
		String s5 = br.readLine();
		String tm = String.parseString(s5);
		System.out.println("The IPL team name is : "+tm);

		System.out.print("Enter Captain name = ");
		String s1 = br.readLine();
		String cn = (String)br.read();
		System.out.println("It's Captain is : "+cn);
		
		System.out.print("Enter Best win percentage = ");
		String s2 = br.readLine();
		float bwp = (float)br.read();
		System.out.println("It has the best win percentage is : "+bwp);

		System.out.print("Enetr number of indian batsmen = ");
		String s3 = br.readLine();
		int nib = (int)br.read();
		System.out.println("Number of indian batsmen are : "+nib);

		System.out.print("Enter number of international batsmen = ");
		String s4 = br.readLine();
		int ib = (int)br.read();
		System.out.println("Number of international batsmen are : "+ib);
	}
}
