
public class StaticKeyword {

	public static void main(String[] args) {
		// static = modifier. A single copy of a variable/method is created and shared
		//          The class "owns" the static member
		Friends friend1 = new Friends("SpongeBobb");
		Friends friend2 = new Friends("Patrick");
		Friends friend3 = new Friends("Squidward");
		Friends friend4 = new Friends("Sandy");
		
		Friends.displayFriends();
		

	}

}
