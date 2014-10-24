package org.rlanza.alcatraz;

import java.util.ArrayList;

public class Door {

	private boolean _lock;
	private String _code;
	private Cell _cell;
	private Hallway _hallway;

	public Door(Cell cell, Hallway hallway, String code) {
		_lock = false;
		_cell = cell;
		_hallway = hallway;
		_code = code;
	}

	public void setLock(Boolean _state) {
		// TODO Auto-generated method stub
		_lock = _state;
	}

	public boolean getStatus() {
		return _lock;
	}

	public void goTrhu(Inmate inmate1) {// Opcion Note
		// TODO Auto-generated method stub
		ArrayList<Inmate> inmates = new ArrayList<Inmate>();
		if (inmate1.getPlace() == _cell) {
			inmate1.setPlace(_hallway);
			inmates.add(inmate1);
			_cell.removeInmate(inmate1);
			_hallway.addInmates(inmates);
			System.out.println("The inmate "+ inmate1.getNumber() + " went from cell " + _cell.getCode() +  " to hallway " + _hallway.getCode());
		} else {
			if (inmate1.getPlace() == _hallway) {
				inmate1.setPlace(_cell);
				inmates.add(inmate1);
				_hallway.removeInmate(inmate1);
				_cell.addInmates(inmates);
				System.out.println("The inmate "+ inmate1.getNumber() + " went from hallway " + _hallway.getCode() +  " to cell " + _cell.getCode());
			} else {
				System.out.println("La celda es incorrecta");
			}
		}

	}

	public String getCode() {
		// TODO Auto-generated method stub
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public Room getHallway() {
		return _hallway;
	}

	public void setHallway(Hallway hallway) {
		_hallway = hallway;
	}

	public Room getCell() {
		return _cell;
	}

	public void setCell(Cell cell) {
		_cell = cell;
	}
}
