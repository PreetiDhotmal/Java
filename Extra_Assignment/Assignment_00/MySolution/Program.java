class MilkyWay {		//class name should be start with the capital latter

	static {

		System.out.println("The name of our Galaxy is Milky Way");
	}
	
	int num = 500;		//2System = we can't give identifire starting with number and also we can't use pre-defined class name as identifire
	static String star = "Pistol";
		
	static public void main(String C2W []){
		
		MilkyWay obj = new MilkyWay();
		obj.PrintSolarSystems();   //we have to give class name where the contructor id declared because the constructor is in another class
		System.out.println("Largest Star in Milky Way Galaxy is : "+star);
		solarSystem ss = new solarSystem();
		ss.Planets();
		solarSystem.printDiameter();	//we have to give object or class name to call this method because it is another class
		
	}

	void PrintSolarSystems(){

		System.out.println("Total number of Solar Systems in Milky Way Galaxy are : "+ num);
	}
}

class solarSystem {	//class name convension must be starting letter capital 

	static int PlanetCount = 9;	//static
	float diameter = 0;

	void solarSystem(){

		diameter = 287.46f;
	}

	void Planets(){

		solarSystem obj1 = new solarSystem();	//creat object of class for calling static variable in non-static method
		System.out.println("Number of Planets = "+obj1.PlanetCount);
	}

	static {

		System.out.println("Our Solar System is called as \"The Solar System\".");
	}

	static void printDiameter(){

		solarSystem obj2 = new solarSystem();	//creat object to call non-static variable in static method
		System.out.println("The Approximate diameter of Solar System is "+obj2.diameter+" Billion KM");
	}

	public static void main(String[] Earth){	//[] we have to give array

		solarSystem Solar = new solarSystem();
		Solar.Planets();
		Solar.printDiameter();	//was wrong method name
		MilkyWay mw = new MilkyWay();
		mw.PrintSolarSystems();
		
	}

	static {

		System.out.println("The \"Solar System\" is Present in One of the Spiral arm of Milky Way");
	}
}

