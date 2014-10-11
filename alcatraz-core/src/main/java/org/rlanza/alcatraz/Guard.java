package org.rlanza.alcatraz;

import java.util.ArrayList;

public class Guard {
	private Hallway _hallway;
	private ArrayList<Inmate> _inmates;

	public Hallway getPlace() {
		return _hallway;
	}

	public void setPlace(Hallway hallway) {
		_hallway = hallway;
	}

	public void beginwatch() {
		// TODO Auto-generated method stub
		_inmates = _hallway.getInmates();
		for (int i = 0; i < _inmates.size(); i++) {
			if (_inmates.get(i).shoot() == true) {
				System.out.println("The Inmate has been killed");
			}

		}
		;

		//cellDoor1.setLock();
		//mainGate.setLock();
		System.out.println("Cell doors and maingate closed");

	}

}
