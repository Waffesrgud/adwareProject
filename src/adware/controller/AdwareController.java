package adware.controller;

import adware.view.AdwareView;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import adware.model.AdwareModel;

public class AdwareController
{
	private AdwareView display;
	private List<AdwareModel> thingyList;
	private List<String> importantFiles;
	
	
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
		
		/*String answer = display.collectResponse("Any number you input is fine, haha. Just make sure it's a number, haha.");
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
		
		} */
		learnLists();
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

	public AdwareController()
	{
		display = new AdwareView();
		thingyList = new ArrayList<AdwareModel>();
	}
	private void testLoop()
	{
		String answer = "sample";
		while(answer != null && !isDouble(answer))
		{
			answer = display.collectResponse("Type a number, bag.");
		}
	}
	
	private void learnLists()
	{
		/*display.displayMessage(thingyList.size() + " is the size of the list.");
		AdwareModel testThingy = new AdwareModel();
		thingyList.add(testThingy);
		display.displayMessage(thingyList.size() + " is the size of the list.");
		
		 for (int index = 0; index <5; index++)
		 {
			  AdwareModel addThingy = new AdwareModel();
			  thingyList.add(addThingy);
			  display.displayMessage(addThingy.getWords());
		 }
		 
		 display.displayMessage(thingyList.size() + " is the size of the list.");
		 
		 thingyList.get(3).setWords("enemy spotted, value changed");
		 AdwareModel temp = thingyList.get(4);
		 temp.setWords("stuff amirite");
		 
		 for (int index = 0; index < thingyList.size(); index++)
		 {
			 display.displayMessage(thingyList.get(index).getWords());
		 }
		 
		 thingyList.add(3, new AdwareModel());
		 
		 display.displayMessage("The size is " + thingyList.size());
		 
		 thingyList.remove(0);
		 
		 display.displayMessage("The size is " + thingyList.size());
		 
		 AdwareModel deletedThingy = thingyList.remove(3);
		 display.displayMessage(deletedThingy.getWords() + " and the list size is now " + thingyList.size());
		 
		 thingyList.set(0,  deletedThingy);
		 
		 for (int index = 0; index < thingyList.size(); index++){
			 display.displayMessage(thingyList.get(index).getWords());
		 }
		 
		 for (AdwareModel currentThingy : thingyList)
		 {
			 display.displayMessage(currentThingy.getWords());
			 thingyList.remove(0);
		 }
		 */
		 for (int index = 0; index < 8; index++){
			 importantFiles.add("This is a very important file. DO NOT DELETE!");
		 }
		 
		 for (int index = 0; index < importantFiles.size(); index++){
			 
		 }
		 
		 
	}
}
