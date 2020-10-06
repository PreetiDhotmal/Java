class Program {

	public static void main(String[] args){

		for(int i=1; i<=100; i++){

			int temp=0, sum=0,rem=0, flag=0;
			while(i!=0){

				temp = i;
				rem = i % 10;
				if(i % rem == 0){
					flag = 1;
				}else{
					continue;
				}
				i = i / 10;
			}
			if(flag == 1)
				System.out.println(temp);
		}
	}
}
