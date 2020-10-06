class Program {

	public static void main(String[] args){

		int i = 5, j = 10;
		int k = 15;
		boolean ans;

		ans = (i < (j - 10))? true : false;  // (5<(10-10)) => (5<0) => false
		System.out.println("Ans = "+ans+" i = "+i+" j = "+j+" K = "+k);	// Ans = false , i = 5 , j = 0, k = 15
		ans = (i == (i = j))? true : false;  //(5 == (i=10)) => (5 == 10) => false
		System.out.println("Ans = "+ans+" i = "+i+" j = "+j+" K = "+k);	//Ans = false, i = 10, j = 10, k = 15
		ans = ((i & j & k) != 0)? true : false;	//((5 & 10 & 15) != 0) => (0 != 0) => true
		System.out.println("Ans = "+ans+" i = "+i+" j = "+j+" K = "+k);	//Ans = true, i = 10, j = 10, k = 15
		ans = ((i ^ j >> 2) == 0)? true : false; //((5 ^ 10 >> 2) == 0) => (3 == 0) => false
		System.out.println("Ans = "+ans+" i = "+i+" j = "+j+" K = "+k);	//Ans = false, i = 10, j = 10, k = 15
	}
}

//AND Operator

//0000 0101 =>5
//0000 1010 =>10

//0000 0000 =>0
//0000 1111 =>15

//0000 0000 =>0

//OR operator

//0000 0101 => 5
//0000 1010 => 10

//0000 1111 => 15
//0000 0011 => 3
