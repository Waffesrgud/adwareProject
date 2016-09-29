package adware.controller;

import java.util.Scanner;

import adware.view.AdwareView;

public class AdwareController
{
	private AdwareView display;
	public AdwareController()
	{
		display = new AdwareView();
	}
	
	public void start()
	{
		/* String computerBrand = "Toshiba PIX2";
		int count = 0;
		String nullCheck = "yes";
		while(count < 20 && nullCheck != null)
		{
			display.displayMessage("Buy a " + computerBrand + " brand computer!");
	
		//Quizzes them on what the best computer brand is, if they get it correct it ends it. 
		//If they enter anything it adds a point for effort. If they put nothing, it doesn't ever end.
		String answer = display.collectResponse("What computer is the best?");
		nullCheck = answer;
		if (nullCheck != null){
		System.out.println("The answer was: " + answer);
		if (answer.equals(computerBrand)){
			count = 20;
		} else if (!answer.equals("") == true){
			count++;
		}
		}
		System.out.println("They're at " + count + " points~!");
		
		
		}	*/
		String answer = display.collectResponse("Any number you input is fine, haha. Just make sure it's a number, haha.");
		if(answer != null && !answer.equals(""))
		{
		if(isDouble(answer))
		{
			System.out.println("Okay, on the double!");
		} else {
			System.out.println("That's sick, and you're sick.");
		}
		if(isInteger(answer)){
			System.out.println("Okay, on the int.");
		} else {
			System.out.println("Shut up, nerd boy.");
		}
		
		}
	}
	/**
	 * This program checks if the input is a valid double and if otherwise returns a message indicating so.
	 * @param potentialValue The input string.
	 * @return Whether or not it is possible to parse the input, in boolean format.
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean isParseable = false;
		
		try
		{
			double test = Double.parseDouble(potentialValue);
			isParseable = true;
		}
		catch(NumberFormatException notDouble)
		{
			display.displayMessage("This is NOT a double value, kiddo.");
		}
		
		return isParseable;
	}
	/**
	 * Checks if the input is a valid integer and if otherwise returns a message indicating so.
	 * @param potentialNumber The input string.
	 * @return Whether or not it can parse the input, in boolean format.
	 */
	private boolean isInteger(String potentialNumber)
	{
		boolean isParseable = false;
		try
		{
			int test = Integer.parseInt(potentialNumber);
			isParseable = true;
			
		}
		catch(NumberFormatException notInt)
		{
			display.displayMessage(notInt.getMessage());
			display.displayMessage("Type in an integer you friccin moron..!");			
		}
		return isParseable;
	}
}
