import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;

import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class MyContainers {
  MyContainers() {

//JPanel = a GUI component that functions as a container to hold other components
    JFrame frame = new JFrame();

    ImageIcon icon = new ImageIcon("dog2.jpeg");

    JLabel label = new JLabel();
    label.setText("HI!");
    label.setIcon(icon);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(750,750);
    frame.setVisible(true);
    
    JPanel redPanel = new JPanel();
    redPanel.setBackground(Color.red);
    redPanel.setBounds(0, 0, 250, 250,);
    frame.add(redPanel);

    JPanel bluePanel = new JPanel();
    bluePanel.setBackground(Color.blue);
    bluePanel.setBounds(250, 0, 500, 500);
    frame.add(bluePanel);

    JPanel MegentaPanel = new JPanel();
    MegentaPanel.setBackground(Color.MAGENTA);
    MegentaPanel.setBounds();
    frame.add(MegentaPanel);
    //Centering the image and text inside the label    
    JPanel greenPanel = new JPanel();
    greenPanel.setBackground(Color.green);
    greenPanel.setBounds();
    frame.add(greenPanel);

    JPanel orangePanel = new JPanel();
    orangePanel.setBackground(Color.orange);
    orangePanel.setBounds();
    frame.add(orangePanel);

    JPanel yellowPanel = new JPanel();
    yellowPanel.setBackground(Color.yellow);
    yellowPanel.setBounds();
    frame.add(yellowPanel);

    JPanel greyPanel = new JPanel();
    greyPanel.setBackground(Color.gray);
    greyPanel.setBounds();
    frame.add(greyPanel);

    greenPanel.add(label);
    //if you want to fine tune where inside the container the image is uncomment below
// label.setBounds(100,75,75, 75); //x coordinate, y coordinate, x width, y width    

//red panel square

       
//blue panel square


//green panel rectangle


//Allows you to fine tune where the image will be inside the label        
    //GUI Basic codes    


       
//add the three colored boxes to the frame

//add the label to the frame


    }
}