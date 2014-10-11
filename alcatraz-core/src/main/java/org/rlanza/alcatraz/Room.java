package org.rlanza.alcatraz;

import java.util.ArrayList;

public class Room {

	// private Inmate myInmate;
	private ArrayList<Door> doors;
	private ArrayList<Inmate> _inmates;

	public Room() {

		doors = new ArrayList<Door>();
		// myInmate = new Inmate();
		_inmates = new ArrayList<Inmate>();
	}

	// public void setEscapedInmate(Inmate inmate) {
	// myInmate = inmate;

	// TODO Auto-generated method stub
	// System.out.println("Inmate is on the hallway");

	// }

	public void removeInmate() {
		// TODO Auto-generated method stub
		System.out.println("Inmate removed from cell.");

	}

	public void getInmates() {
		// TODO Auto-generated method stub

	}

	public Inmate getInmate() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Door> getDoors() {
		return doors;
	}

}
