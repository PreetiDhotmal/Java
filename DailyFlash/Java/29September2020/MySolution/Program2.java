/* Create an hard coded integer array of size 5 and print the number from array which are even */

class Program {

	public static void main(String[] args){

		int arr[] = {1,2,3,4,5};
		for(int i=0; i<5; i++)
			if(arr[i] % 2 == 0)
				System.out.print(arr[i]+" ");
		System.out.println();
	}
}
