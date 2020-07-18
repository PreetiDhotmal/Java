class MyRoom{

	static int windows = 6;
	int lights = 5;

	static void openWindows() {

		System.out.println("Window is open");
	}

	void lightOn() {

		System.out.println("Light is off");
	}	
}

class BrothersRoom {

	static int windows = 6;
	int lights = 5;

	static void openWindows() {

		System.out.println("Window is close");
	}
	
	void lightOn() {

		System.out.println("Light is on");
	}
}

class Home {

	public static void main(String[] args) {

		MyRoom obj1 = new MyRoom();
		obj1.lights = 2;
		obj1.openWindows();
		obj1.lightOn();

		BrothersRoom obj2 = new BrothersRoom();
		obj2.lights
 = 1;
		obj2.openWindows();
		obj2.lightOn();
	}
}
