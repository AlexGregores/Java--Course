
public class Constructors {

	public static void main(String[] args) {
		// constructor = special method that is called when an object is instantiated(created)
		Human human1 = new Human("Maria",31,56);
		Human human2 = new Human("Alex",41,70);
		
     System.out.println(human1.name);
     System.out.println(human2.name);
     
     human2.eat();
     human1.drink();
     
	}

}
