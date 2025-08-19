import javax.swing.*;
import java.awt.event.*;
import java.awt.image.ImageProducer;
import java.awt.Color;

public class MyFrame extends JFrame{


	MyFrame(){
		//jframe = gui window to add components to
		this.setSize(450, 450); // set window size
		this.setTitle("jframe window"); // set title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		ImageIcon image = new ImageIcon("cat.jpeg");
		this.setIconImage(image.getImage());
		//\this.getContentPane().setBackground(Color.green);
		JLabel label = new JLabel(image);
		this.getContentPane().add(label);
		
	}
}
