
/*
 * Public can not be in uppercase
 * Class name starts with capital and 'class' is a keyword, must be in lowercase
 * if you write public class File name and class name should be same
 * */

public class Temperature {

	public static void main(String[] args) {	//String is class thats why capital S in String[]

		double fahrenheit = 62.5;
		/* Convert */
		double celsius = f2c(fahrenheit);	// Double to float loosy conversion

		System.out.println(fahrenheit + " F " + " = " + celsius + " C ");
	}

	static double f2c(double fahr) {   		//parameter float so loosy conversion make it double

		double f = (fahr - 32.0)*(5.0/9.0);
		return f;
	}
}
