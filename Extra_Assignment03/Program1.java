class Chinese{

	static int noOfProducts = 50;
	
	static void productBoycott(){

		System.out.println("No of Application Boycott = "+noOfProducts);
	}
	void chineseProduct(){

		System.out.println("Don't use chinese Product");
	}

	public static void main(String[] args){

		Chinese ch = new Chinese();
	
		ch.noOfProducts = 58;
		productBoycott();
		ch.chineseProduct();
	}
}
