import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class MyPanel {
  MyPanel() {
  ImageIcon image = new ImageIcon("cat.jpeg");
  Border border = BorderFactory.createLineBorder(Color.green, 3);
  JLabel label = new JLabel();
  label.setIcon(image);
  label.setText("Howdy!");
  label.setHorizontalTextPosition(JLabel.CENTER);
  label.setVerticalTextPosition(JLabel.TOP);
  label.setVerticalAlignment(JLabel.CENTER);
  label.setHorizontalAlignment(JLabel.CENTER);
  label.setForeground(Color.green);

  JFrame frame = new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500, 500);
  frame.setVisible(true);
  frame.add(label);
  frame.pack();
  

  
  }
}