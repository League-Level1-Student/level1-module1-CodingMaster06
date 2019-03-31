import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class binaryConverter implements MouseListener {
public static void main(String[] args) {
binaryConverter bc = new binaryConverter();	
	bc.GUI();
	
} 
JTextField answer = new JTextField(20);
JFrame f = new JFrame();
JPanel p = new JPanel();
JLabel l = new JLabel();
JButton b = new JButton();
public void GUI() {
	
	
	b.addMouseListener(this);
	f.setVisible(true);
	f.add(p);
	p.add(l);
	p.add(answer);
	p.add(b);
	b.setText("Convert");
	
	f.pack();
	
}

public void mousePressed(MouseEvent e) {
	
	l.setText(convert(answer.getText()));
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}


