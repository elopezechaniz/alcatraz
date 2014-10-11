package org.rlanza.alcatraz;

public class Inmate {
	private Cell _place;
	private Hallway _hallway;

	// private Door cellDoor;

	public void beginEscape() {
		// cellDoor = getDoor(_hallway);
		getDoor(_hallway).goTrhu(this, _hallway, _place);//segun veo, el hallway esta vacio :(

	}

	private Door getDoor(Hallway _hallway2) {
		// TODO Auto-generated method stub
		return _hallway.getDoor();
	}

	public Cell getPlace() {
		// TODO Auto-generated method stub
		return _place;
	}

	public void setPlace(Cell place) {
		// TODO Auto-generated method stub
		_place = place;

	}

	public boolean shoot() {
		// TODO Auto-generated method stub
		return die();
	}

	public boolean die() {
		return true;
		// TODO Auto-generated method stub

	}

	public void setPlace(Hallway hallway1) {
		// TODO Auto-generated method stub
		_hallway = hallway1;
	}

}
