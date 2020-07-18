public class MyClass {
	long var;
	
	public void MyClass(long param) { 				//(1)
		var = param;
		System.out.println(var);
	 }


	public static void main(String[] args) {
		MyClass a, b;
		a = new MyClass();					//(2)
		b = new MyClass();
		b.MyClass(5L);						//(3)
	}

}
