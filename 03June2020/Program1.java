import java.lang.*;

class Year2020 {
	//instance variable   goes in constructor
	int x = 10;
	//Static variable    goes in Static block
	static int y = 20;

	Year2020() {
		System.out.println("In constructor");
	}

	public static void main(String[] args) {
		Year2020 obj = new Year2020();
		System.out.println("Danger...!");
	}
}

