package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class OBJECTION {
public static void main(String[] args) {
String Apollo=	JOptionPane.showInputDialog("When is your birthday");
if (Apollo.equals("10 23")) {
	JOptionPane.showMessageDialog(null, "Happy Birthday");
}else {
	JOptionPane.showMessageDialog(null,"happy unbirthday");
}
}
}
