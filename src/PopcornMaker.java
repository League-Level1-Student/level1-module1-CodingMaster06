import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
String flavor = JOptionPane.showInputDialog("What flavor of Popcorn do you want?");
Popcorn P = new Popcorn(flavor);
Microwave M = new Microwave();
String time1 = JOptionPane.showInputDialog("How long do you want to cook it?");
M.putInMicrowave(P);
int time = Integer.parseInt(time1);
M.setTime(time);
P.eat();
}
}
