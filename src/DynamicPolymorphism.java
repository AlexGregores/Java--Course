import java.util.Scanner;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		// polimorphism = many shapes/forms
		// dynamic = after compilation(during run time)
		
		// ex A corvette is a :corvette, and a car, and a vehicle, and an object
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What animal do you want?");
		System.out.println("(1=lion) or (2=wolf):");
		int choice = scanner.nextInt();
		
		if(choice==1) {
			animal = new Lion();
			animal.speak();
		}
		
		else if(choice==2) {
			animal = new Wolf();
			animal.speak();
		}
		else {
			animal = new Animal(); {
				System.out.println("That choice was invalid");
				animal.speak();
			}
		}
	}

}
