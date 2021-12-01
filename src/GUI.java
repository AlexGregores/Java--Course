import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI {

	public static void main(String[] args) {
		// JFrame = a GUI window to add components
		/*
		JFrame frame = new JFrame();//creates a frame
		frame.setTitle("JFrame title goes here");//sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the application
		frame.setResizable(false);//prevent frame to be resize
		frame.setSize(420,420);// this sets the x-dimension and y-dimension of frame
		frame.setVisible(true);// make frame visible
		
		ImageIcon image = new ImageIcon("C:\\Users\\alexa\\eclipse-workspace\\Java Course\\src\\youtube.jpg");// this will create an image icon
		frame.setIconImage(image.getImage());// change icon of frame
		frame.getContentPane().setBackground(new Color(150,0,0));//change color background
		*/
		
		MyFrame myframe = new MyFrame();
	}
	

}
