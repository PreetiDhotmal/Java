public class ThisUsage {

	int planets;
	static int suns;

	public void gaze() {
		int i;

		/* The 3 Correct Statements are */
		//1
		i = this.planets;
		//2
		i = this.suns;
		//3
		this.suns = planets;
	}

	//The main Function is added to check if the Function is Correct (Syntactically)
	public static void main(String[] args){


		ThisUsage tu = new ThisUsage();
		tu.gaze();
	}
}
