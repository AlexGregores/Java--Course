import java.util.*;
public class ArrayList2D {

	public static void main(String[] args) {
		// 2D ArrayList = a dynamic list of lists
		// You can change the size of these lists during runtime
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("carolina");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatos");
		produceList.add("zuchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("tea");
		drinksList.add("beer");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		
		
		System.out.println(bakeryList);
		System.out.println(bakeryList.get(0));
		
		System.out.println(groceryList.get(2).get(1));


	}

}
