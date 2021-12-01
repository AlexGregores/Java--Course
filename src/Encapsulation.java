
public class Encapsulation {

	public static void main(String[] args) {
		// Encapsulation = attributes of a class will be hidden or private,
		//                 Can be accessed only through methods (getters and setters)
		//                 You should make attributes private if you don't have a reason to make then
		Computer computer = new Computer("Dell", "Opitflex",2021);
		
		
		
		computer.setYear(2022);
		
		System.out.println(computer.getMake());
		System.out.println(computer.getModel());
		System.out.println(computer.getYear());

	}

}
