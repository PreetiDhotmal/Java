class FloatDemo {

	public static void main(String[] args) {
		
		float f = 25.6f;                 //float gives us range of 4 bytes means 32 bits
		System.out.println(f);

		double d = 25.6;		//double gives us range of 8 bytes means 64 bits
		System.out.println(d);

		if(f == d)
			System.out.println("Same value");
		else
			System.out.println("Different value");
		//double and float are two different keywords it stores value differently bocause its range is different 
	}
}
