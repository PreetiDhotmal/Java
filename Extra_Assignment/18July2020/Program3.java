class OperatorsDemo{

	public static void main(String[] args){

		int i = 10, j = 20;
		boolean ans;

		ans = (i++ >= j++) && (--j < i++);	//(10 >= 20) && (20 < 11)
							//False && False 
		System.out.println("Ans = "+ans);	//False

		ans = (--i < j--) || (j++ >= ++i);	//(11 < 20) || (20 >= 12)
							//True || True
		System.out.println("Ans = "+ ans);	//True
	}
}
