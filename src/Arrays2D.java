
public class Arrays2D {

	public static void main(String[] args) {
		// 2D array = an array of arrays
		
		String[][] bands = new String[3][3];
		
		bands[0][0] = "Black sabbath";
		bands[0][1] = "Judas priest";
		bands[0][2] = "Dead can dance";
		bands[1][0] = "Wasp";
		bands[1][1] = "King diamond";
		bands[1][2] = "Mayhem";
		bands[2][0] = "Motorhead";
		bands[2][1] = "katatonia";
		bands[2][2] = "Emperor";
		
		for(int i=0;i<bands.length;i++) {
			System.out.println();
			for(int j=0; j<bands[i].length; j++) {
				System.out.println(bands[i][j]);
			}
		}
		
	
		

	}

}
