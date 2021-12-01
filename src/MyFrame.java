import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Jthis;

public class MyFrame extends JFrame {
   MyFrame(){
	    this.setTitle("Jthis title goes here");//sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the application
		this.setResizable(false);//prevent this to be resize
		this.setSize(420,420);// this sets the x-dimension and y-dimension of this
		this.setVisible(true);// make this visible
		
		ImageIcon image = new ImageIcon("C:\\Users\\alexa\\eclipse-workspace\\Java Course\\src\\youtube.jpg");// this will create an image icon
		this.setIconImage(image.getImage());// change icon of this
		this.getContentPane().setBackground(new Color(150,0,0));//change color background
		
   }
	

}
