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
		String computerBrand = "Toshiba PIX2";
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
		System.out.println("They're at " + count + " points~!");
		}
		}
	}
}