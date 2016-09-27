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
	
	/**
	 * Gets the user answer and formats it!
	 * @param question The question asked.
	 * @return The response.
	 */
	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
		
		return response;
	}
}
