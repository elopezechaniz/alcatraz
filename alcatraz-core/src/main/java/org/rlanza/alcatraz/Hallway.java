package org.rlanza.alcatraz;

import java.util.ArrayList;
import java.util.List;

public class Hallway {
	private ArrayList<Inmate> _inmates;
	private ArrayList<Door> _doors;

	public Hallway() {
		_inmates = new ArrayList<Inmate>();
	}

	public ArrayList<Inmate> getInmates() {
		return _inmates;
	}

	public void addInmates(ArrayList<Inmate> inmatesList) {
		for (int i = 0; i < inmatesList.size(); i++) {
			_inmates.add(inmatesList.get(i));
		}
	}

	public Door getDoor() {
		// public void addCellDoors(ArraList<Door> )
		return _doors.get(1);
	}
}
