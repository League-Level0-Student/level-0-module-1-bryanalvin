package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int crash = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddleshat
		String answer = JOptionPane.showInputDialog("You are my brother but i am not your brother what am i");
		if (answer.equals("sis")) {
			JOptionPane.showMessageDialog(null, "OBJECTION!");
			// 5. Otherwise, say "wrong" and tell them the answer
			
			// 6. Add some more riddles
			String answer = JOptionPane.showInputDialog("You are a boi But i am not a boi what am i");
			if (answer.equals("girl"));			// 2. Make a pop up to show the score.
		
		}
		else {
			JOptionPane.showMessageDialog(null, "You Suck");
		}
		JOptionPane.showMessageDialog(null, crash);
	}
}
