class Capgemini {

	static int noOfEmp = 200000;
	int projectCount = 200;

	void displayProject() {

		System.out.println("Cap total count = "+projectCount);
	}

	static void empInfo() {

		System.out.println("Cap Project count = "+noOfEmp);
	}
}

class TCS {

	static int noOfEmp = 300000;
	int projectCount = 500;

	void displayProject() {

		System.out.println("TCS total count = "+projectCount);
	}

	static void empInfo() {

		System.out.println("TCS Project count = "+noOfEmp);
	}
}

class ITCompany {

	public static void main(String[] args) {

		Capgemini pune = new Capgemini();
		pune.projectCount = 130;

		pune.empInfo();				//200000
		pune.displayProject();			//130

		Capgemini Chennai = new Capgemini();
		Chennai.projectCount = 70;

		Chennai.empInfo();			//200000
		Chennai.displayProject();		//70

		TCS mumbai = new TCS();
		mumbai.projectCount = 270;

		mumbai.empInfo();				//200000
		mumbai.displayProject();			//130

		TCS banglore = new TCS();
		banglore.projectCount = 230;

		banglore.empInfo();			//200000
		banglore.displayProject();		//70

	}
}
