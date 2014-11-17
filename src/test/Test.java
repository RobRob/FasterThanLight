package test;

import java.util.Scanner;

public class Test {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		ship.Ship kestrel = new ship.Kestrel();
		crew.Crew testCrew = kestrel.getShipCrew().get(0);
		layout.Square testSquareR4 = kestrel.getRooms().get("R4").firstFreeSquare();
		layout.Square testSquareR9 = kestrel.getRooms().get("R9").firstFreeSquare();
		
		String userInput = "";
		while (!userInput.equals("quit")) {
			userInput = input.next();
			String[] userInputArray = userInput.split(" ");
			
			switch (userInputArray[0]) {
			case "moveR4" : testCrew.moveToSquare(testSquareR4); break;
			case "moveR9" : testCrew.moveToSquare(testSquareR9); break;
			case "getstats" : System.out.println(kestrel.generateReadout()); break;
			}
		}
	}
}
