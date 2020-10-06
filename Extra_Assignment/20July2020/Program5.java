class Cricket{

	static int totalPlayer = 13;
	int runs = 200;

	static void team(){

		System.out.println("The total players in the team is "+totalPlayer);
	}

	void toWin(){

		System.out.println("Total runs to win the match is "+runs);
	}
}

class Kabbadi{

	static int totalPlayer = 9;
	int score = 19;

	static void team(){

		System.out.println("The total players in the team is "+totalPlayer);
	}

	void toWin(){

		System.out.println("Total runs to win the match is "+score);
	}
}

class Sports{

	public static void main(String[] args){

		Cricket obj1 = new Cricket();

		obj1.team();
		obj1.toWin();

		Kabbadi obj2 = new Kabbadi();

		obj2.team();
		obj2.toWin();
	}
}
