public class ThisUsage {
	int planets;
	static int suns;
	
	public void gaze() {
		int i;

		i = this.planets;
		i = this.suns;
		this.suns = planets;
	}
	public static void main(String[] args){

		ThisUsage tu = new ThisUsage();
		tu.gaze();
	}
}
