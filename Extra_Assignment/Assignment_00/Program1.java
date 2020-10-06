class milkyWay {

	static {

		System.out.println("The name of our Galaxy is Milky Way");
	}
	
	int 2System = 500;
	static String star = "Pistol";
		
	static public void main(String C2W []){

		PrintSolarSystems();
		System.out.println("Largest Star in Milky Way Galaxy is : "+star);
		solarsystem ss = new solarsystem();
		ss.Planets();
		printDiameter();
		
	}

	void PrintSolarSystems(){

		System.out.println("Total number of Solar Systems in Milky Way Galaxy are : "+ 2System);
	}
}

class solarsystem {

	static int PlanetCount = 9;
	float diameter = 0;

	void solarsystem(){

		diameter = 287.46f;
	}

	void Planets(){

		System.out.println("Number of Planets = "+PlanetCount);
	}

	static {

		System.out.println("Our Solar System is called as \"The Solar System\".");
	}

	static void printDiameter(){

		System.out.println("The Approximate diameter of Solar System is "+diameter+" Billion KM");
	}

	public static void main(String... Earth){

		solarsystem Solar = new solarsystem();
		Solar.Planets();
		Solar.printtDiameter();
		milkyWay mw = new milkyWay();
		mw.PrintSolarSystems();
		
	}

	static {

		System.out.println("The \"Solar System\" is Present in One of the Spiral arm of Milky Way");
	}
}

