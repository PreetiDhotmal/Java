class Computer{

	public static void main(String[] args){

		Computer USB = new Computer();
		Computer PD = new Computer();

		System.out.println(USB instanceof Computer);
		System.out.println(PD instanceof Computer);
	}
}
