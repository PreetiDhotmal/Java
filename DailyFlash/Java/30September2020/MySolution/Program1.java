/* Write a java program to test if an array contains a specific value. my_array1 = {1789,2035,1899,2013,1458,2458,1254,1472,2365};
Contains 2013 in array ?
contains 2015 in array ?  */

class Program {

	public static void main(String[] arga){

		int arr[] = {1789,2035,1899,2013,1458,2458,1254,1472,2365};
		int c1 = 2013, c2 = 2015;
		
		for(int i=0; i<9; i++)
			if(c1 == arr[i] || c2 == arr[i])
				System.out.println(arr[i]+" is in the contains");
	}
}
