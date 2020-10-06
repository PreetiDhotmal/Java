class Program {

	public static void main(String[] args){

		boolean bVar = true;
		boolean bVar1 = false;
		char cVar = 'S';
		int iVar = 0;
		boolean res = true, ans = true;
		

		ans = (bVar == (iVar == cVar))? true : false;
		if(ans == true)
			System.out.println(iVar);
		else
			System.out.println(cVar);
	}
}
