/*
 * Problem Statement
 *
 * Write a program to convert two values from Wrapper Class to primitive datatype and access each value in one instance method and one static method and access instance method by creating object and access static method without any object.
 *
 * */

class Elections {

	//Static Object of Wrapper Class (Integer)
	static Integer val1 = new Integer(911950734);

	//Non-Static Object of Wrapper Class (Float)
	Float val2 = new Float(67.41);

	//Static Method to convert wrapper object into primitive
	static void voters(){

		Elections ls2019 = new Elections();
		//Non-Static object accessed by class object
		int totalVoters = ls2019.val1.intValue();
		System.out.println("During the 2K19 Lok Sabha Elections "+totalVoters+" Number of People Voted");
	}

	//Non-Static Method to convert wrapper object into primitive
	void percent(){

		//Static object can be directly accessed from non-static method
		float votePercent = val2.floatValue();
		System.out.println("Voting Percentage of India in 2K19 is "+votePercent+" percent");
	}

	public static void main(String[] args){

		Elections loksabha = new Elections();

		//Static method accessed without object
		voters();

		//Non-Static(instance) method called using Object
		loksabha.percent();
	}
}
