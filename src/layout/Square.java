package layout;

import java.util.*;

public class Square {
	
	// INSTANCE VARIABLES
	
	protected ArrayList<Integer> coordinates;
	protected Map<layout.Square, layout.Square> route = new HashMap<layout.Square, layout.Square>();
	
	protected Room parentRoom;
	protected crew.Crew crewMember;
	
	protected Map<String, Boolean> walls = new HashMap<String, Boolean>();
	protected Map<String, Boolean> doors = new HashMap<String, Boolean>();
	
	protected boolean fire = false;
	protected boolean breach = false;
	
	// GET AND SET METHODS
	
	public ArrayList<Integer> getCoordinates() {return coordinates;}
	public crew.Crew getCrew() {return crewMember;}
	public void setCrew(crew.Crew c) {
		crewMember = c; 
		if (c != null) {
			c.setLocation(this);}
		}
	public Map<Square, Square> getRoute() {return route;}
	
	public Square(int x, int y) {
		coordinates = new ArrayList<Integer>();
		coordinates.add(x);
		coordinates.add(y);
	}
	
	// OTHER METHODS
	
	public String toString() {
		String returnString = "Square :" + coordinates.toString() + "\n";
		for (Map.Entry<Square, Square> r : route.entrySet()) {
			returnString += "Is connected to: " + r.getKey().getCoordinates().toString() + "\n";
		}
		return returnString;
	}
	
	public boolean containsPerson() {
		if (crewMember == null) {return false;}
		else {return true;}
	}
	
	public void setParentRoom(Room r) {
		parentRoom = r;
	}
	
	public void setRoute(Square destination, Square nextStop) {
		route.put(destination, nextStop);
	}
	
	public boolean isWall(String s) {
		return walls.get(s);
	}
	
	public boolean isDoor(String s) {
		return doors.get(s);
	}
	
	public Square getRoute(Square destination) {
		if (route.containsKey(destination)) {
			return route.get(destination);
		}
		else {
			ArrayList<Square> checkedSquares = new ArrayList<Square>();
			checkedSquares.add(this);
			Square returnSquare = null;
			for (Map.Entry<Square, Square> s: route.entrySet()) {
				if (!checkedSquares.contains(s.getValue())) {
					returnSquare = s.getValue().getRoute(destination, checkedSquares);
					if (returnSquare != null) {
						setRoute(destination, returnSquare);
						return returnSquare;
					}
				}
			}
			return returnSquare;
		}
	}
	
	public Square getRoute(Square destination, ArrayList<Square> checkedSquares) {
		if (route.containsKey(destination)) {
			return route.get(destination);
		}
		else {
			checkedSquares.add(this);
			Square returnSquare = null;
			for (Map.Entry<Square, Square> s: route.entrySet()) {
				if (!checkedSquares.contains(s.getValue())) {
					returnSquare = s.getValue().getRoute(destination, checkedSquares);
					if (returnSquare != null) {
						setRoute(destination, returnSquare);
						return returnSquare;
					}
				}
			}
			return returnSquare;
		}
	}
}
