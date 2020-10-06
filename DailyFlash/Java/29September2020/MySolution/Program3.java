/* Create an hard coded float array of size 5 and print the aveerage of the element of the array */

class Program {

	public static void main(String[] args){

		float sum = 0;
		float farr[] = {10.5f,20.5f,30.5f,40.5f,50.5f};
		for(int i=0; i<5; i++)
			sum = sum + farr[i];
		System.out.println("Average = "+sum/5);
	}
}
