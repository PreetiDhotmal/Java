class Program {

	public static void main(String[] args){

		char ch = 'A';
		String sVar;
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			sVar = "Vowel";
		else
			sVar = "Consonant"; 
		switch(sVar){

			case "Vowel":
				System.out.println(ch+" is vowel");
				break;
			case "Consonant":
				System.out.println(ch+" is consonant");
		}
	}
}
