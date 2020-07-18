class PrePostOperation{

	public static void main(String[] args){

		int a=10,b=20,c=50;
		int ans=0;
		
		ans = a++ + ++b + ++c;

		System.out.printf("Output = "+ans+"\n");
	}
}
/*
ans = 10++ + ++b + ++c
ans = 10 + ++20 + ++c
ans = 10 + 21 + ++50
ans = 10 + 21 + 51
ans = 82
*/
