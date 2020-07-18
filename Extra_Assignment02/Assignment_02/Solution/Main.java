public class Main {

	public static void main(String[] args) {

		double num = 10.99;
		System.out.println("The double value: " + num);

		//Converts double to int
		int data = (int)num;
		System.out.println("The integer value: " + data);

		// converts int to string type
		String data1 = String.valueOf(num);
		System.out.println("The string value is: " + data1);

		String data2 = "10";
		System.out.println("The string value is: " + data2);

		// convert string variable to int
		int num1 = Integer.parseInt(data2);
		System.out.println("The integer value is: " + num1);
	}
}
