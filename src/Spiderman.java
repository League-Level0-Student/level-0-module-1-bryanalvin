import javax.swing.JOptionPane;

public class Spiderman {
public static void main(String[] args) {

	
	String Viktor="SAO x Machina";
	
	String Kinnesa=JOptionPane.showInputDialog("Type in a message");
	

	String Lex=JOptionPane.showInputDialog("You can only see the message if you can guess the password");
if(Viktor.equals(Lex)) {
	
	JOptionPane.showMessageDialog(null, Kinnesa);
}else JOptionPane.showMessageDialog(null, "INTRUDER!");

}


}


