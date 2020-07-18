class COVID19{ //object
	//constructor
}
class Lockdown extends COVID19{  //COVID19

	Lockdown() {
		//suoer()	COVID19()
		System.out.println("In constructor");
	}
	public static void main(String[] args){

		Lockdown obj = new Lockdown();
		System.out.println("Lockdown Extend Zale");
	}
}
