class Dominos{

	int price = 300;
	int quantity = 2;
	static int total = 500;

	static void bill(){

		System.out.println("The total amount is "+total);
	}

	public static void main(String[] args){

		System.out.println("Thank You For Visiting Here..!");
		
		Dominos pizza = new Dominos();
		pizza.price = 200;
		pizza.bill();
		
		Dominos fries = new Dominos();
		fries.price = 150;
		fries.bill();

		int Bill = pizza.price + fries.price; 

		System.out.println("The total bill for pizza & fries is "+Bill);
	}
}
