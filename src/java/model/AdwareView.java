package java.model;

import javax.swing.JOptionPane;

public class AdwareView
{
	/**
	 * Makes a cute lil' pop up to display the message.
	 * @param message The message that will be used in the popup.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
}
