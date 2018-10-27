
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 10th";
		String dadsBirthday = "March 27th";
		String myBirthday = "May 28th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birth = JOptionPane.showInputDialog("which birthday u want");
		// 3. Print out what the user typed
		System.out.println(birth);
		// 4. if user asked for "mom"
		if (birth.equalsIgnoreCase("Mom")) {
			System.out.println(momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		else if (birth.equalsIgnoreCase("Dad")) {
			System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		else if (birth.equalsIgnoreCase("You")) {
			System.out.println(myBirthday);
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, i don't remember that person's birthday!");
		}
	} 
}
