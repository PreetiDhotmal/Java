class IndiaRTO{

	public static void main(String[] args){

		int ch = 1;
		System.out.println("Enter number between 1 to 5 = "+ ch);

		switch(ch){

			case 1:
				System.out.println("AP - Andhra Pradesh");
				break;
			case 2:
				System.out.println("AS - Assam");
				break;
			case 3:
				System.out.println("BR - Bihar");
				break;
			case 4:
				System.out.println("CG - Chhattisgarh");
				break;
			case 5:
				System.out.println("CH - Chandigarh");
				break;
			default:
				System.out.println("District not found in the list");
				break;
		}
	}
}
