package org.rlanza.alcatraz;

import java.util.ArrayList;

public class Cell {

	private ArrayList<Door> doors;
	private ArrayList<Inmate> _inmates;
	private Door cellDoor;

	public Cell() {
		_inmates = new ArrayList<Inmate>();
		cellDoor = new Door();
		
	}

	public void removeInmate(Inmate inmate) {

		// TODO Auto-generated method stub

		for (int i = 0; i < _inmates.size(); i++) {
			if (_inmates.get(i) == inmate) {
				_inmates.remove(i);
				System.out.println("inmate removed from cell");
			}

		}

	}
}
