package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {

	Robot rob=new Robot();
	
	String a = JOptionPane.showInputDialog("wot shape?");
	String c = JOptionPane.showInputDialog("wot color?");
	if (c.toLowerCase().equals("blue")) {
		rob.setPenColor(0, 0, 250);
	}
	else if (c.toLowerCase().equals("red")) {
		rob.setPenColor(250, 0, 0);
	}
	else if (c.toLowerCase().equals("green")) {
		rob.setPenColor(0, 250, 0);
	}
    //6. If the user doesn’t enter anything, choose a random color
	if (c.equals("")) {
		rob.setRandomPenColor();
	}
	if(a.equalsIgnoreCase("square")) {
		drawSquare(rob);
	}
	else if(a.equalsIgnoreCase("triangle")) {
		drawTriangle(rob);
	}
	else if(a.equalsIgnoreCase("circle")) {
		drawCircle(rob);
	}
	
	
	

	}
	private static void drawSquare(Robot rob) {
		//Robot rob=new Robot();
		//rob.penDown();
		for(int i = 0; i < 4; i++) {
			//4. Set the pen width to 10
			rob.setPenWidth(10);
		    //2. Make the robot draw a shape (this will take more than one line of code)
			rob.setSpeed(50);
			rob.penDown();
			rob.move(250);
			rob.turn(90);
		
	}
		
}
	private static void drawTriangle(Robot rob) {
		//Robot rob=new Robot();
		//rob.penDown();
		for(int i = 0; i < 3; i++) {
			rob.setPenWidth(10);
		    //2. Make the robot draw a shape (this will take more than one line of code)
			rob.setSpeed(50);
			rob.penDown();
			rob.turn(120);
			rob.move(250);
}
	}
	private static void drawCircle(Robot rob) {
		//Robot rob=new Robot();
		//rob.penDown();
		for(int i = 0; i < 100; i++) {
			rob.setPenWidth(10);
		    //2. Make the robot draw a shape (this will take more than one line of code)
			rob.setSpeed(250);
			rob.penDown();
			rob.turn(5);
			rob.move(25);
}
	}
}