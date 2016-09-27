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
		while(count < 10)
		{
			display.displayMessage("Buy a " + computerBrand + " brand computer!");
	
		//Quizzes them on what the best computer brand is, if they get it correct it ends it. 
		//If they enter anything it adds a point for effort. If they put nothing, it doesn't ever end.
		String answer = display.collectResponse("What computer is the best?");
		if (answer.equals(computerBrand)){
			count = 10;
		} else if (answer.equals("")||answer.equals(null) == false){
			count++;
		}
		}
	}
}