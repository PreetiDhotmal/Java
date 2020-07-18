class Core2Web {

	static int totalStudentCount = 2500;
	int batchStudentCount = 0;

	void dispStudentCount() {

		System.out.println("Total Student = "+ totalStudentCount);
		System.out.println("Batch Student = "+ batchStudentCount);
	}
}

class C2WAppAdmin {

	static int totalLoginCount = 1200;
	int videoCount = 0;
	
	void dispStat() {
		
		System.out.println("Total login count = "+ totalLoginCount);
		System.out.println("video Count = "+ videoCount);
	}
}

class Mentor {

	public static void main(String[] args) {

		Core2Web java9_10 = new Core2Web();
		java9_10.batchStudentCount = 370;
		java9_10.dispStudentCount();

		Core2Web PPA5 = new Core2Web();
		PPA5.batchStudentCount = 290;
		PPA5.dispStudentCount();
		
		C2WAppAdmin python0 = new C2WAppAdmin();
		python0.videoCount = 25;
		python0.dispStat();
		python0.totalLoginCount = 1000;					//static variable change

		C2WAppAdmin os = new C2WAppAdmin();
		os.videoCount = 150;
		os.dispStat();
	}
}
