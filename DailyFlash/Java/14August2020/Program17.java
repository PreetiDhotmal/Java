class Program {

	public static void main(String[] args){

		int i = 9;

		int j,m=0,flag=0;
		m=i/2;
		if(i==0||i==1)
			System.out.println(i+" is not a prime number");
		else{
			for(j=2; j<=m; j++){
				if(i % j == 0){
					flag = 1;
					break;
				}
			}if(flag == 0)
				System.out.println(i+" is prime number");
			else
				System.out.println(i+" is not a prime number");
		}
	}
}

