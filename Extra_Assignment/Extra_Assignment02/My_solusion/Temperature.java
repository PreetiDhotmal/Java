public class Temperature {
	public static void main(String args[]) {
		double fahr = 62.5;
		Temperature T1 = new Temperature();
		double celsius = T1.f2c(fahr);
		System.out.println("fahrenheit = " + celsius + "C");
	}

double f2c(double fahr) {
		
	return (fahr - 32.0) * 5.0 / 9.0;
	}
}
