class IfElseDemo{

	public static void main(String[] args){

		int x = 10;
		int y = 11;

		if(++x <= ++y){						//if((11<=12) = true

			System.out.println("In if statement");		//print
			System.out.println("x = "+ x);			//11
			System.out.println("y = "+ y);			//12
		}else{
	
			System.out.println("In else statement");
			System.out.println("x = "+ x);
			System.out.println("y = "+ y);
		}

		System.out.println("Out of is else");		//print 
	}
}
