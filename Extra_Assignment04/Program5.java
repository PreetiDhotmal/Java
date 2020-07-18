class PrePostOperation1{

	public static void main(String[] args){

		int a=10, b=20, c=50;
		int ans = 0;

		ans = a++ + --b + c--;

		System.out.println("Output = "+ans);
	}
}
/*
ans = a++ + --b + c--
ans = 10++ + --b + c--
ans = 10 + --b + c--
ans = 10 + --20 + c--
ans = 10 + 19 + 50--
ans = 10 + 19 + 50
ans = 79
*/
