import java.util.Random;

public class DiceRoller {
	// you can declare outside of the methods
	//Random = random;
	//int number;

	DiceRoller(){
		Random random  = new Random();
		int number = 0;
		roll(random,number);// or you can sign parameters
	}
	void roll(Random random,int number){ // or you can sign parameters
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}



