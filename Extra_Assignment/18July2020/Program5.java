class Pune{

	static int covidActionCases = 100000;
	int totalCases = 700000;

	static void noCorona(){

		System.out.println("In no corona method");
	}

	void lockdown(){

		Pune obj1 = new Pune();
		obj1.covidActionCases = 2000;
		System.out.println("Covide Action cases = "+ covidActionCases);
	}

	void noLockdown(){

		totalCases = 0;
		System.out.println("Total cases = "+totalCases);
	}
}

class Mumbai{

	static int covidActionCases = 500000;
	int totalCases = 1000000;

	static void noCorona(){

		System.out.println("In no corona method");
	}

	void lockdown(){

		Mumbai obj3 = new Mumbai();
		obj3.covidActionCases = 10000;
		System.out.println("Covid Action Cases = "+ covidActionCases);
	}

	void noLockdown(){

		totalCases = 0;
		System.out.println("total cases = "+totalCases);		
	}
}

class Maharashtra{

	public static void main(String[] args){

		Pune p = new Pune();
		p.noCorona();
		p.lockdown();
		p.noLockdown();

		Mumbai m = new Mumbai();
		p.noCorona();
		m.lockdown();
		m.noLockdown();

	}
}


