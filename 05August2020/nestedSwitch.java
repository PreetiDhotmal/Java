class NestedSwitchDemo{

	public static void main(String[] arhs){

		int floor = 2;
		
		switch(floor){

			case 1:
				{

					char ch='f'; //s for shopping, F for food
					System.out.println("First Floor");

					switch(ch){

						case 'S':
						case 's':
							System.out.println("Shopping");
							break;
						case 'F':
						case 'f':
							System.out.println("Nusta khaicha");
							break;
						default:
							System.out.println("Service not available");
							break;
					}
				}
				break;
			case 2:
				{

					char ch='M'; //m for Movie, P for PlayStation
					System.out.println("Second Floor");

					switch(ch){

						case 'M':
						case 'm':
							System.out.println("Dil Bechara");
							break;
						case 'P':
						case 'p':
							System.out.println("Football");
							break;
						default:
							System.out.println("Service not available");
							break;
					}
				}
				break;
			default:
				System.out.println("Wrong Floor");
				break;
		}
	}
}
