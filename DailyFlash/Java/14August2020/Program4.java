/*class Program{

	public static void main(String[] args){

		int a=10, b=20, c=30;
		int x=23334, y=1010, z=10000;
		int p=1999, q=2000, r=1998;

		if(a>b && a>c)
			System.out.println(a+" is greater");
		else if(b>a && b>c)
			System.out.println(b+" is greater");
		else
			System.out.println(c+" is greater");

		if(x>y && x>z)
			System.out.println(x+" is greater");
		else if(y>x && y>z)
			System.out.println(y+" is greater");
		else
			System.out.println(z+" is greater");

		if(p>q && p>r)
			System.out.println(p+" is greater");
		else if(q>p && q>r)
			System.out.println(q+" is greater");
		else
			System.out.println(r+" is greater");
	}
}

*/



class Program{

	public static int largestNum(int[]a, int total){

		int temp;
		
		for(int i=0; i<total; i++){

			for(int j=i+1; j<total; j++){

				if(a[i] > a[j]){

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total-1];
	}
	public static void main(String[] args){

		int d[] = {455,800,56,39,290,18,383,3,290,29,10};
		int b[] = {10,9,4,5,6,7,8,3};
		int c[] = {10,8,56,23,45,97};

		System.out.println("Largest Number : "+largestNum(d,11));
		System.out.println("Largest Number : "+largestNum(b,8));
		System.out.println("Largest Number : "+largestNum(c,6));
	}
}
