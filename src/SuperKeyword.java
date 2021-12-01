
public class SuperKeyword {

	public static void main(String[] args) {
		// super = keyword refers to the superclass (parent) of an object
		//         very similar to the "this" keyword
		
		Hero hero1 = new Hero ("Superman",42,"everything");
		Hero hero2 = new Hero ("Batman",43,"$$$");
		
		System.out.println(hero1.name);
		System.out.println(hero1.power);
		System.out.println(hero1.toString());
		System.out.println(hero2.toString());
		
		
		
		
	}

}
