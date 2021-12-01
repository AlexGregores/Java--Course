import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		// file = an abstract representation of file and directory pathnames
		
		File file = new File("C:\\Users\\alexa\\OneDrive\\Área de Trabalho\\teste");
		
		if(file.exists()) {
			
			System.out.println("That file exist");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
		}
		else {
			System.out.println("That file doesn't exist");
		}
	}

}
