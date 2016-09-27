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
	 display.displayMessage("Hello, world!");
	}
}