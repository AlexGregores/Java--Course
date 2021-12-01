
public class ToStringMethod {

	public static void main(String[] args) {
		// toString() = special method that all objects inherit,
		//              that returns a string that "textually represents" an object.
		//              can be used both implicitly and explicitly
     Cars car = new Cars();
    	 
     System.out.println(car.make);
     System.out.println(car.model);
     System.out.println(car.year);
     System.out.println(car.color);
     //System.out.println(car);//return the code number object that java has in memory
     System.out.println();
     
     System.out.println(car.toString()); // return make +"\n"+model+"\n"+color+"\n"+year;
     
     System.out.println(car);
	}

}
