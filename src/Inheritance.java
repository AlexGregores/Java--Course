
public class Inheritance {

	public static void main(String[] args) {
		// inheritance = the process where one class acquires,
		//               the attributes and methods of another
		
		Skate skate = new Skate();
		
		skate.go();
		
		Bike bike = new Bike();
		bike.stop();
		
		System.out.println(skate.speed);
		System.out.println(bike.speed);
		
		System.out.println(skate.wheels);
		System.out.println(bike.wheels);
		

	}

}
