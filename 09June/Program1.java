//Byte
//-128 to 127

class ByteDemo {
	
	public static void main(String[] args) {
	
		byte myData = 127;                //only gives range between -128 to 127 
		System.out.println(myData);
		myData++;
		System.out.println(myData);		//if we try in increase value by + operator it will wrap the range between -128 to 127
		myData++;
		System.out.println(myData);          

		// if we give out of range value it will give error as incompatible value 
	}
}
