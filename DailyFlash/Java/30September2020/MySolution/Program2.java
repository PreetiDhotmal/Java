/* Write a java program to find the index of an index element my_array = {25,14,56,15,36,56,77,18,29,49}; 
Index position of 25?
Index position of 77?   */

class Program {

	public static void main(String[] args){

		int arr[] = {25,14,56,15,36,56,77,18,29,49};
		int p1 = 25, p2 = 77;

		for(int i=0; i<10; i++)
			if(p1 == arr[i] || p2 == arr[i])
				System.out.println(i);
	}
}
