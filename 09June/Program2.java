class ShortDemo {
	
	public static void main(String[] args) {

		short x = 32767;          // short gives us range between -32768 to 32767
		System.out.println(x);
		++x;
		System.out.println(x);   // if we increment the value by + operator it will wrap the value between the range

		// if we declare the value out of range it will give us the error as incompatible value 
	}
}
