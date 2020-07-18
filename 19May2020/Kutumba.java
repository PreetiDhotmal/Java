class Kutumba {
	int mob = 1;
	int laptop = 1;
	static int TV = 1;

	void display(){
		System.out.println("In display");
	}
	static void statDisplay(){
		System.out.println("In ststDisplay");
	}
	public static void main(String[] args){

		Kutumba obj1 = new Kutumba();
		obj1.display();
		obj1.statDisplay();

		Kutumba obj2 = new Kutumba();
		obj2.display();
		obj2.statDisplay();
	}
}
