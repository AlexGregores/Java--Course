import java.util.ArrayList;
public class ArrayList_ {

	public static void main(String[] args) {
		// ArrayList = a resizable array.
		//            Elements can be added and removed after compilation
		//            store reference data types
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("lasanha");
		food.add("chicken");
		
		food.set(0,"Tuna");
		food.remove(1);
		
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
		
		

	}

}
