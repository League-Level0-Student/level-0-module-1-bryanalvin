package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks 
{
	
	public static void main(String[] args) 
	{
	
			// 1. Save the superpower for each person in a variable.
		String alex = "Ice Powers";
		String bryan = "Super Speed";
		String andy = "Cyclops";
		String jesus = "Spider Powers";
		String maran = "Stop time";
		String neftalli = "Super strength";
		String haley = "Telekenises";
		
			// 2. Ask the user to enter a name. Store their answer in a variable.
		String answer = JOptionPane.showInputDialog("Enter a name");
			// 3. Show the superpower in a pop-up, depending on the name entered. 
		if(answer.equals("alex")) 
		{
			JOptionPane.showMessageDialog(null, alex);
		}
		if(answer.equals("bryan")) 
		{
			JOptionPane.showMessageDialog(null, bryan);
		}if(answer.equals("andy")) {JOptionPane.showMessageDialog(null,
	}

}