class IfLadderDemo{

	public static void main(String[] args){

		int x = 25;

		if(x >= 0 && x <= 10){				//true && false = false

			System.out.println("Number between 0 and 10");
		}else if(x >= 10 && x <= 20){

			System.out.println("Number between 10 and 20");
		}else if(x >= 20 && x <= 30){

			System.out.println("Number between 20 and 30");
		}else if(x >= 30){

			System.out.println("Number greater than 30");
		}else{

			System.out.println("Please enter positive number");
		}
	}
}
