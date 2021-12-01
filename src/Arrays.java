
public class Arrays {

	public static void main(String[] args) {
		// array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro","Corvette","Tesla","BMW"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[3]);
		
		// other way to declare a array
		
		String[] books = new String[4];
		
		books[0] = "Fiction";
		books[1] = "Romance";
		books[2] = "History";
		books[3] = "Spirituality";
		
		System.out.println(books[3]);
		//using for loop
		
		for(int i =0; i<books.length;i++) {
			System.out.println(books[i]);
		}
		
		System.out.println(books[3]);
		
		
	}

}
