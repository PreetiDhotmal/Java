class Attendance{

	int attent = 65;

	public void isEligible(int attent){

		if(attent >= 75){

			System.out.println("The student is eligible for the exam");
		}else{

			System.out.println("The student is not eligible for the exam");
		}
	}

	public static void main(String[] args){

		Attendance obj = new Attendance();

		obj.isEligible(65);
	}
}
