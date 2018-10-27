package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		
		String H = JOptionPane.showInputDialog("Are you happy?");
		if (H.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null,"Do whatever");
		}
	
		else if (H.equalsIgnoreCase("no")) {
			String D = JOptionPane.showInputDialog("Do u want to be hap?");
		
		
			if (D.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null,"change something");
		}
		
			else if (D.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null,"Do whatever");
		}
		}
}
}