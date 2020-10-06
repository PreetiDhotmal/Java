public class MyClass {

	long var;

	public void   MyClass(long param) { 

		var = param;		//(1)
		System.out.println(var);
	} 

	public static void main(String[] args) {

		MyClass a, b;
		a = new MyClass();	//(2)
		b = new MyClass();
		b.MyClass(5L);		//(3) MyClass is not constructor its class Method,so theres only one default constructor

	}
}
