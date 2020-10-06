class Program{

	public static void main(String[] args){

		int val=143;
	
		while(val!=0){

			int j,m=0,flag=0,i;
			i = val % 10;			
			val = val / 10;			
			m=i/2;
			if(i==0||i==1)
				System.out.print(i+" ");
			else{
				for(j=2; j<=m; j++){
					if(i % j == 0){
						flag = 1;
						break;
					}
				}if(flag == 0)
					System.out.print(i+" ");		
			}
		}
		System.out.println();
	}	
}
