
public class OOP {

	public static void main(String[] args) {
		// Object = an instance of a class that may contain attributes and methods
		// examples :(phone, desk, computer, coffee cup)
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		
		System.out.println(myCar1.model);
		System.out.println(myCar1.make);
		System.out.println();
		System.out.println(myCar2.model);
		System.out.println(myCar2.make);
		
        myCar1.drive();
        myCar1.brake();
	}

}
