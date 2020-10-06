class Program{

	public static void main(String[] args){

		int num = 10, pow = 2,temp=0;
		
		int ans=0; 
		temp=num;
		
		for(int i=1; i<pow; i++){
			ans = num * num;
			num = ans;
		}
	
		System.out.println(temp+" to the power "+pow+" is "+ans);
	}
}
