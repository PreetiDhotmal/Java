class IndianArmy{

	static int matrixMarks = 33;
	int PCMCMarks = 50;
	static int diplomaMarks = 50;

	void basicEducation(){

		System.out.println("10th and 12th Marks = "+PCMCMarks);
	}
	
	static void graduation(){

		System.out.println("Matrix Marks should be "+matrixMarks);
		System.out.println("Diploma Marks should be "+diplomaMarks);
	}
}
class IndianNavy{

	static int diplomaMarks = 60;
	int masterMarks = 60;

	static void basicEducation(){

		System.out.println("Diploma marks should be "+diplomaMarks);
	}
	void graduation(){

		System.out.println("Masters marks should be "+masterMarks);
	}
}
class IndianAirForce{

	static int diplomaMarks = 50;
	int PCMCMarks = 60;

	void basicEducation(){

		System.out.println("10th and 12th marks should be "+PCMCMarks);
	}

	static void graduation(){

		System.out.println("Diploma marks should be "+diplomaMarks);
	}
}

class India{

	public static void main(String[] args){

		System.out.println("We are so proud to have them...!");

		IndianArmy obj1 = new IndianArmy();
		obj1.basicEducation();
		obj1.graduation();

		IndianNavy obj2 = new IndianNavy();
		obj2.basicEducation();
		obj2.graduation();

		IndianAirForce obj3 = new IndianAirForce();
		obj3.basicEducation();
		obj3.graduation();
	}
}
