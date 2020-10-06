class LogicalDemo{

	public static void main(String[] args){

		int x = 2;
		int y = 3;
		boolean ans;

		ans = (++x < y++) && (x++ < ++y);
		System.out.println("ans = "+ ans);
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);

		ans = (++x <= y++) || (x++ < ++y);
		System.out.println("ans = "+ ans);
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);

	}
}

/*
ans = (3 < 3);
ans = False
x = 3
y = 4

ans = (4 <= 4);
ans = True
x = 4
y = 5

*/
