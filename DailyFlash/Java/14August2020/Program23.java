class Program {

	public static void main(String[] args){

		int num1 = 10, num2 = 15, lcm;

		lcm = (num1>num2)? num1 : num2;
		while(true){

			if(lcm % num1 == 0 && lcm % num2 == 0){
				System.out.println("The LCM of "+num1+" and "+num2+" = "+lcm);
				break;
			}
			++lcm;
		}
	}
}
