class Angle{

	public static void main(String[] args){

		int angle = 20;

		if(angle > 90 && angle < 180){

			System.out.println("The angle is Obtuse Angle");

		}else if(angle < 90 && angle > 0){

			System.out.println("The angle is Acute Angle");

		}else if(angle == 90){

			System.out.println("The angle is Right");
		}
	}
}
