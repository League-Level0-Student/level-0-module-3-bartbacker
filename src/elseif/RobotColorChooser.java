//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob=new Robot();
		//3. Ask the user what color they would like the robot to draw
		for(int i = 0; i < 4; i++) {
		String a = JOptionPane.showInputDialog("what color do u want?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (a.toLowerCase().equals("blue")) {
			rob.setPenColor(0, 0, 250);
		}
		if (a.toLowerCase().equals("red")) {
			rob.setPenColor(250, 0, 0);
		}
		if (a.toLowerCase().equals("green")) {
			rob.setPenColor(0, 250, 0);
		}
        //6. If the user doesn’t enter anything, choose a random color
		if (a.equals("")) {
			rob.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		for(int i2 = 0; i2 < 4; i2++) {
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.setSpeed(150);
		rob.penDown();
		rob.move(250);
		rob.turn(90);
		}
	}
	}
}
