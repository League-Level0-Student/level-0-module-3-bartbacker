package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		
		String sign = JOptionPane.showInputDialog("whats ur star sign?");
		if (sign.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Forward thinking");
		}
		else if (sign.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "Pleasure seeking");
		}
		else if (sign.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "chatty");
		}
		else if (sign.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "Likeable");
		}
		else {
			JOptionPane.showMessageDialog(null, "That not a sign");
}
}
}