class Program{

	public static void main(String[] args){

		int a=50, b=7, c=56;
		
		if(a<b && a<c)
			System.out.println(a+" is small");
		else if(b<a && b<c)
			System.out.println(b+" is small");
		else
			System.out.println(c+" is small");
	}
}
