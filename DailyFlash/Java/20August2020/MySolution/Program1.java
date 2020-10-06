/* Write a program to take all threesides of a triangle from user and check whether the triangle satisfies the pythagorean theorem
Input : side 1 = 3
	side 2 = 4
	Hypotenuse = 5
Output : Triangle satisfies the pythagorean theorem
*/

class Program {

	public static void main(String[] args){
	
		int side1 = 3, side2 = 4, Hypo = 5,ans;
		System.out.println("Side 1 = "+side1);
		System.out.println("Side 2 = "+side2);
		System.out.println("Hypotenuse = "+Hypo);

		ans = (side1*side1)+(side2*side2);
		if((ans*ans)==(Hypo*Hypo))
			System.out.println("Triangle satisfies the pythagorean theorem");
		else
			System.out.println("Triangle does not satisfies the pythagorean theorem");
	}
}
