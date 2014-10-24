package org.rlanza.alcatraz;

public class Inmate {
	private Room _place;
	private int _number;
	private boolean _alive;

	public Inmate(int number, Room place) {
		_place = place;
		_number = number;
		_alive = true;

	}

	public void beginEscape() {
		// cellDoor = getDoor(_hallway);
		Cell c = (Cell) _place;
		if (c == null) {
			System.out.println("inmate allready scaped");
			return;
		}
		c.getDoor().goTrhu(this);
	}

	// private Door getDoor(Room _hallway2) {
	// TODO Auto-generated method stub
	// return _hallway2.getDoor();
	// }

	public Room getPlace() {
		// TODO Auto-generated method stub
		return _place;
	}

	public void setPlace(Room place) {
		// TODO Auto-generated method stub
		_place = place;

	}

	public boolean shoot() {
		// TODO Auto-generated method stub
		return die();
	}

	public boolean die() { // this a basic method for correct compile.
		return true;
		// TODO Auto-generated method stub

	}

	/*
	 * public void setPlace(Hallway hallway1) { // TODO Auto-generated method
	 * stub _hallway = hallway1; }
	 */

	public int getNumber() {
		// TODO Auto-generated method stub
		return _number;
	}

	public void setNumber(int number) {
		_number = number;
	}
}
