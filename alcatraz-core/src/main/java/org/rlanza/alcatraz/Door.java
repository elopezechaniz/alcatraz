package org.rlanza.alcatraz;

import java.util.ArrayList;

public class Door {

	private boolean lock;
	private ArrayList<Inmate> _inmates;
	
	public Door()
	{
		_inmates = new ArrayList<Inmate>();
		lock = false;
		
	}

	public void setLock(Boolean _state) {
		// TODO Auto-generated method stub
		lock = _state;

	}

	public void goTrhu(Inmate inmate1, Hallway hallway1, Cell cell1) {
		// TODO Auto-generated method stub
		if (inmate1.getPlace() == cell1);
		{
			inmate1.setPlace(hallway1);
			_inmates.add(inmate1);
			cell1.removeInmate(inmate1);
			hallway1.addInmates(_inmates);
			}
			

		}

	}


