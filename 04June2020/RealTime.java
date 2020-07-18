class Home {

	int noOfRoom = 4;
	static int nameOfBedroom = 2;

	void bedRoom() {
	
		System.out.println("Sleeping time");
		System.out.println("Happy hours");
	}
	
	static void kitchen() {
	
		System.out.println("Working time");
		System.out.println("Most difficult hours");
	}
}

class Output {

	public static void main(String[] args) {

		System.out.println("Daily works");

		Home obj = new Home();
		obj.bedRoom();
		Home.kitchen();
	}
}
