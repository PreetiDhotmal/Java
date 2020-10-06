class Operations{

	public static void main(String[] args){

		int num1 = 10, num2 = 20, ans = 0;
		int op = 1;
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Mul");
		System.out.println("4. Div");
		System.out.println("5. Mod");

		switch(op){

			case 1:
				ans = num2 + num1;
				System.out.println("Add = "+ ans);
				break;

			case 2:
				ans = num2 - num1;
				System.out.println("Sub = "+ ans);
				break;

			case 3:
				ans = num2 * num1;
				System.out.println("Mul = "+ ans);
				break;

			case 4:
				ans = num2 / num1;
				System.out.println("Div = "+ans);
				break;
		
			case 5:
				ans = num2 % num1;
				System.out.println("Mod = "+ ans);
				break;
			default:
				System.out.println("Wrong choice");
				break;
		}
	}
}
