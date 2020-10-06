class Program{

	public static void main(String[] args){

		String ch = "abcd";

		for(int i=0; i<ch.length(); i++){

			int asciiValue = ch.charAt(i);
			System.out.println(ch.charAt(i)+" = "+asciiValue);
		}
	}
}
