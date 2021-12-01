
public class OverloadedConstructors {

	public static void main(String[] args) {
		// overloaded constructors = multiple constructors within a class with the same name,
		// but different parameters
		// name + parameters = signature

		Pizza pizza = new Pizza("thic crust","tomato","muzarella","pepperoni");
		
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
}
}


