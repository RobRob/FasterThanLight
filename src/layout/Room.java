package layout;

import java.util.*;

public class Room {
	
	// INSTANCE VARIABLES
	
	protected system.System system;
	protected ArrayList<Square> squareList = new ArrayList<Square>();
	
	public Room(system.System sys) {
		system = sys;
		if (system != null) {
			system.setLocation(this);
		}
	}
	
	// GET AND SET METHODS
	
	public system.System getSystem() {return system;}
	public ArrayList<Square> getSquareList() {return squareList;}
	
	// OTHER METHODS
	
	public void addSquare(Square s) {
		s.setParentRoom(this); // gives the square a reference to the room
		squareList.add(s);	// gives the room a reference to the square
	}
	
	public Square firstFreeSquare() {
		for (Square s : squareList) {
			if (!s.containsPerson()) {
				return s;
			}
		}
		return null;
	}
	
	public boolean containsPerson() {
		for (Square s : squareList) {
			if (s.containsPerson()) {return true;}
		}
		return false;
	}
}
