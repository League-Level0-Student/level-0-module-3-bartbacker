//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String b = JOptionPane.showInputDialog("Do u like bananz?");
		//2. if they say no, 
		if(b.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "you're crazy!");
		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		else if(b.equalsIgnoreCase("yes")) {
			String h = JOptionPane.showInputDialog(null, "What's your favorite hob?");
			JOptionPane.showMessageDialog(null, h+" is much better with bananas!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are bananas!");
			
		}
	
		
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		
		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}

}
