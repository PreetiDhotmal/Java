class SwitchCase{

	public static void main(String[] args){

		char ch = 'J';

		switch(ch){

			case 'J':
				System.out.println("Java");
				break;
			case 'C':
				System.out.println("C Programming");
				break;
			case 'P':
				System.out.println("Python");
				break;
			case 'R':
				System.out.println("Ruby");
				break;
			case 'O':
				System.out.println("Objective-C");
				break;
			default:
				System.out.println("Not in the list");
				break;
		}
	}
}
