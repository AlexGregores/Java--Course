
public class ArrayOfObjects {

	public static void main(String[] args) {
		// Food[] refrigerator = new food[3];
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("lasanha");
		Food food3 = new Food( "chocolate");
		
		Food[] refrigerator = {food1,food2,food3};
		
		//refrigerator[0] = food1;
		//refrigerator[1] = food2;
		//refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
		
		

	}

}