//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String c_str = JOptionPane.showInputDialog("how many cats do u have?");
		// 2. Convert their answer into an int
		int	c_int=Integer.parseInt(c_str);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if(c_int > 3) {
			JOptionPane.showMessageDialog(null, "ur a crazy cat lady");
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		if(c_int < 3 && c_int > 0) {
			playVideo("https://www.youtube.com/watch?v=dGFSjKuJfrI");
		}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		if(c_int == 0) {
			playVideo("https://www.youtube.com/watch?v=sxAlWUSkACs");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

