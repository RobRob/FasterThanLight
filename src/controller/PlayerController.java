package controller;

import java.util.*;

public class PlayerController {
	
	protected Scanner input;
	
	public PlayerController() {
		input = new Scanner(System.in);
	}
	
	public String getCommand() {
		return input.next();
	}
	
	public void executeCommand(String cmd) {
		
	}
}
