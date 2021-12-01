
public class Polymorphism {

	public static void main(String[] args) {
		// polymorphism = greek word for poly - "many", morph -"form"
		//                The ability of an object to identify as more than one type
		
		Plane plane = new Plane();
		Boat boat = new Boat();
		Train train = new Train();
		
		Transports[] travellers = {plane, boat, train};
		
		for(Transports x:travellers) {
			x.go();
		}
	}

}
