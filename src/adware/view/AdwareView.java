package adware.view;

import javax.swing.JOptionPane;

/**
 * Pop-up Viewer class
 * @author Grayson C
 * @version September 27th, 2016
 */
public class AdwareView
{
	/**
	 * Makes a cute little pop-up to display the message.
	 * @param message The message that will be used in the pop-up.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Gets the user answer in string format!
	 * @param question The question asked.
	 * @return The response.
	 */
	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
		
		return response;
	}
	/**
	 * Creates a pop-up that asks a yes/no/cancel question. :)
	 * @param question It's the question to be asked.
	 * @return The constant value from JOptionPane for yes/no/cancel.
	 */
	public int collectUserOption(String question){
		int response = 0;
		
		response = JOptionPane.showConfirmDialog(null,  question);
				
		return response;
	}
}
 