//Java Program to demonstrate the Trip Planning according to fare and distance
//where we analyze the fare and distance according to budget
//Creating International tour which has destination() and mode of transport i.e flightTransport() or otherTransport() written
//Creating India tour which has destination() and mode of transport i.e flightTransport() or otherTransport() written

class InternationalTour{
	//static variable
	static int distance=2044;

	//instance variables
	int fareByFlight = 34000;
	int fareByCruise = 50000;

	//static method to print destination distance
	static void destination(){
		System.out.println("Maldives (Distannce): "+distance);
	}
	//instance method to print flight fare
	void flightTransport(){
		System.out.println("By Flight Fare: "+fareByFlight);
	}
	
	//instance method to print other transport fare
	void otherTransport(){
		System.out.println("By Cruise Fare: "+fareByCruise);
	}

}

class IndiaTour{

	//static variable
	static int distance =1200;
	//instance variables
	int fareByFlight=12000;
	int fareByTrain=5000;

	//static method to print distance of destination
	static void destination(){
		System.out.println("Uttarakhand (Distance): "+distance);
	}

	//instance method to print flight fare
	void flightTransport(){
		System.out.println("By Flight Fare: "+fareByFlight);
	}
	
	//instance method to print other transport fare
	void otherTransport(){
		System.out.println("By Train Fare: "+fareByTrain);
	}
}

//Class Vacation to get info about international tour and India tour 
class Vacation{

	public static void main(String[] args) {

		System.out.println("International Travel....");

		InternationalTour it = new InternationalTour();
			it.destination();
			it.flightTransport();
			it.otherTransport();

		System.out.print("India Travel.....");

		IndiaTour nt = new IndiaTour();
			nt.destination();
			nt.flightTransport();
			nt.otherTransport();

	}
}