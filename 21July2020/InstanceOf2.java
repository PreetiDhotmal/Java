class FootBall{

}

class Cricket{

	public static void main(String[] args){

		Cricket t20 = new Cricket();
		Cricket test = new Cricket();
		FootBall fmatch = new FootBall();

		System.out.println(t20 instanceof Object);	//true
		System.out.println(fmatch instanceof FootBall);	//true
	}
}
