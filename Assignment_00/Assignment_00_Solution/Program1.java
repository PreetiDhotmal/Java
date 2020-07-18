/*
 * Execution of Program 
 * For starting with Main from MilkyWay --> Denoted as A
 * For starting with Main from SolarSystem --> Denoted as B
 * */


//Classes are named in Hungarian Style - Start of Each word in Capitals
//class milkyWay {

//Correct Naming
class MilkyWay {

	//A1
	//B5
	static {

		System.out.println("The name of our Galaxy is Milky Way");
	}
	
	//Variable Name cannot start with number also Variable name cannot be a predefined Class (System)
	//int 2System = 500;

	//Correct Statement (non-static Variable [Need Class Object])
	int system = 500;

	//static variable, can be called directly from static method, with class object or by class name
	static String star = "Pistol";
		
	//Main Method
	static public void main(String C2W []){

		//non static method cannot be called from static method so need a object
		//Printsolarsystems();
		
		//Correct Way - Using class instance
		MilkyWay m = new MilkyWay();
		m.printSolarSystems();

		//static variable is directly accessible from static method, 'main'
		//A3
		System.out.println("Largest Star in Milky Way Galaxy is : "+star);
		
		//Change The Class name According to Hungarian Style and Method to Camel Case Style
		//solarsystem ss = new solarsystem();
		//ss.Planets();
		
		SolarSystem ss = new SolarSystem();
		ss.planets();
		
		//Static Methods of Another class can be accessed by instance of the Class
		ss.printDiameter();
	}

	//Methods are named in camelCase first word is in lowercase and rest all words begin with Uppercase
	//void Printsolarsystems(){

	//Correct Naming
	//A2
	void printSolarSystems(){

		//Change of Variable Expected
		//System.out.println("Total number of Solar Systems in Milky Way Galaxy are : "+ 2System);
		System.out.println("Total number of Solar Systems in Milky Way Galaxy are : "+ system);
	}
}

//Hungarian Naming 
//class solarsystem {

class SolarSystem {

	//Variable names are in lowercases (Convention)
	//static int PlanetCount = 9;
	
	//Variable name includes '_' to separate 2 words
	static int planet_count = 9;
	float diameter = 0;

	/*
	 * Constructor does not contain a return type, and name of the class and Constructor must be same
	void solarsystem(){

		diameter = 287.46f;
	}
	*/

	//Constructor is used to initialise the Value of the Variable diameter as 287.46 float Value
	SolarSystem(){

		diameter = 287.46f;
	}

	//B3
	//A6
	void planets(){

		//Change the Variable name if done previously
		//System.out.println("Number of Planets = "+PlanetCount);
		
		System.out.println("Number of Planets = "+planet_count);
	}

	//B4
	//A7
	static void printDiameter(){

		SolarSystem s = new SolarSystem();
		System.out.println("The Approximate diameter of Solar System is "+s.diameter+" Billion KM");
	}

	//B1
	//A4 When First Time is a Static method or variable of a Class is used or its Object is Created its static Block is Executed
	static {

		System.out.println("Our Solar System is called as \"The Solar System\".");
	}

	

	public static void main(String... Earth){

		//Class Name updated, and Variable in lowercase 
		//solarsystem Solar = new solarsystem();

		SolarSystem solar = new SolarSystem();
		solar.planets();
		
		//Static method Called by Class instance
		solar.printDiameter();
		MilkyWay mw = new MilkyWay();

		//Change the Method Name According to the Camel Case Style
		//mw.Printsolarsystems();
		mw.printSolarSystems();
		
	}

	//B2
	//A5
	static {

		System.out.println("The \"Solar System\" is Present in One of the Spiral arm of Milky Way");
	}
}

