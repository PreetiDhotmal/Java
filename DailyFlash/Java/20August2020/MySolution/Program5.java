/* Write a program to take marks of five subject physics,Chemistry,Biology,mathematics and computer, calculate percentage and grade according to foolowing
percentage >= 90 : Grade A
percentage >= 80 : Grade B
percentage >= 70 : Grade C
percentage >= 60 : Grade D
percentage >= 40 : Grade E
percentage < 40 : Grade F
*/

class Program {

	public static void main(String[] args){
	
		int py = 70,ch = 70, bi = 70, ma = 80, com = 85, marks;
		marks = (py + ch + bi + ma + com)/5;
		if(marks>=90)
			System.out.println("Marks = "+marks+" Grade = A");
		else if(marks>=80)
			System.out.println("Marks = "+marks+" Grade = B");
		else if(marks>=70)
			System.out.println("Marks = "+marks+" Grade = C");
		else if(marks>=60)
			System.out.println("Marks = "+marks+" Grade = D");
		else if(marks>=40)
			System.out.println("Marks = "+marks+" Grade = E");
		else if(marks<40)
			System.out.println("Marks = "+marks+" Grade = F");		
	}
}
