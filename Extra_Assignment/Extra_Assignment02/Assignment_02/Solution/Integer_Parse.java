public class Integer_Parse {

	public static void main(String args[]){

		int value1;
		float value2;

		if (args.length > 0) {

			value1 = Integer.parseInt(args[0]);  
			value2 = Float.parseFloat(args[1]);
			System.out.println("Sum of parameters is : "+(value1+value2));
		}
	}
}
