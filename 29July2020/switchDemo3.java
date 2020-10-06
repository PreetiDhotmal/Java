class SwitchDemo{

	public static void main(String[] args){

		String x = new String("shashi");
	
		switch(x){

			case "Shashi":
				System.out.println("Camel case");
				break;
			case "shashi":
				System.out.println("small case");
				break;
		}
	}
}
