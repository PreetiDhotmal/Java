class Program5{

	public static void main(String[] args){

		for(int i=1; i<=10; i++){

			System.out.println(i*3);
		}
		
		System.out.println("The even numbers present in the table are : ");

		for(int i=1; i<=10; i++){
	
			int ans=0;
			ans = i * 3;
			if(ans % 2 == 0)

				System.out.println(ans);
		}
	}
}
