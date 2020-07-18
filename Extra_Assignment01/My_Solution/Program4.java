class RepOctal {

	public static void main(String[] args) {

		System.out.println("Byte range : ");
		System.out.println("Binary representation : "+Integer.toBinaryString(Byte.SIZE));
		System.out.println("Octal representation : "+Integer.toOctalString(Byte.SIZE));

		System.out.println();
		System.out.println("Short range : ");
		System.out.println("Binary representation : "+Integer.toBinaryString(Short.SIZE));
		System.out.println("Octal representation : "+Integer.toOctalString(Short.SIZE));
	
		System.out.println();		
		System.out.println("Integer range : ");
		System.out.println("Binary representation : "+Integer.toBinaryString(Integer.SIZE));
		System.out.println("Octal representation : "+Integer.toOctalString(Integer.SIZE));

		System.out.println();		
		System.out.println("Long range : ");
		System.out.println("Binary representation : "+Integer.toBinaryString(Long.SIZE));
		System.out.println("Octal representation : "+Integer.toOctalString(Long.SIZE));

		System.out.println();		
		System.out.println("Float range : ");
		System.out.println("Binary representation : "+Integer.toBinaryString(Float.SIZE));
		System.out.println("Octal representation : "+Integer.toOctalString(Float.SIZE));

		System.out.println();		
		System.out.println("Double range : ");
		System.out.println("Binary representation : "+Integer.toBinaryString(Double.SIZE));
		System.out.println("Octal representation : "+Integer.toOctalString(Double.SIZE));

		
	}
}
