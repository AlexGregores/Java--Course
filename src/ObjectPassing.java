
public class ObjectPassing {

	public static void main(String[] args) {
		Garage garage = new Garage();
		
		Motocycle moto1 = new Motocycle("Yamaha");
		Motocycle moto2 = new Motocycle("Honda");
		
		garage.park(moto1);
		garage.park(moto2);

	}

}
