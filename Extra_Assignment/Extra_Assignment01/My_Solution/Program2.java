class Represent {

	public static void main(String[] args) {

		int x = 10, y = 18, z = 5, a = 20;
		System.out.println("Binary represantation of 10 : "+Integer.toBinaryString(x));
		System.out.println("Binary represantation of 18 : "+Integer.toBinaryString(y));
		System.out.println("Binary represantation of 5 : "+Integer.toBinaryString(z));
		System.out.println("Binary represantation of 20 : "+Integer.toBinaryString(a));
		
		System.out.println();
		System.out.println("Octal represantation of 10 : "+Integer.toOctalString(x));
		System.out.println("Octal represantation of 18 : "+Integer.toOctalString(y));
		System.out.println("Octal represantation of 5 : "+Integer.toOctalString(z));
		System.out.println("Octal represantation of 20 : "+Integer.toOctalString(a));

		System.out.println();
		System.out.println("Hexa-Decimal represantation of 10 : "+Integer.toHexString(x));
		System.out.println("Hexa-Decimal represantation of 18 : "+Integer.toHexString(y));
		System.out.println("Hexa-Decimal represantation of 5 : "+Integer.toHexString(z));
		System.out.println("Hexa-Decimal represantation of 20 : "+Integer.toHexString(a));
	}
}
