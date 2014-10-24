package org.rlanza.alcatraz;

import java.util.ArrayList;

public abstract class Room {

	private ArrayList<Door> _doors;
	private ArrayList<Inmate> _inmates;
	private String _code;
	
	
	public Room(String code) {
		_inmates = new ArrayList<Inmate>();
		_doors = new ArrayList<Door>();
		_code = code;
	}

	public ArrayList<Inmate> getInmates() {
		return _inmates;
	}

	public void addInmates(ArrayList<Inmate> inmatesList) {
		for (int i = 0; i < inmatesList.size(); i++) {
			_inmates.add(inmatesList.get(i));
		}
	}

	public void addDoors(ArrayList<Door> doors) {
		for (int i = 0; i < doors.size(); i++) {
			_doors.add(doors.get(i));
		}
	}

	public Door getDoor(String code) {
		// public void addCellDoors(ArraList<Door> )
		int i;
		for (i = 0; i < _doors.size(); i++) {
			if (_doors.get(i).getCode() == code)
				return _doors.get(i);
		}
		return null;
	}

	public void addDoor(Door door1) {
		// TODO Auto-generated method stub
		_doors.add(door1);
		printAddedDoor(door1.getCode());
	}

	public String getCode() {
		// TODO Auto-generated method stub
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}
	
	public void removeInmate(Inmate inmate) {

		// TODO Auto-generated method stub

		for (int i = 0; i < _inmates.size(); i++) {
			if (_inmates.get(i) == inmate) {
				_inmates.remove(i);
				//System.out.println("inmate number"+inmate.getNumber()+" has been removed");
				printRemovedInmate(inmate);
			}

		}

	}
	
	
	

protected abstract void printRemovedInmate(Inmate inmate);

//	//public Room() {
//
//		doors = new ArrayList<Door>();
//		// myInmate = new Inmate();
//		_inmates = new ArrayList<Inmate>();
//	//}

	// public void setEscapedInmate(Inmate inmate) {
	// myInmate = inmate;

	// TODO Auto-generated method stub
	// System.out.println("Inmate is on the hallway");

	// }

	public void removeInmate() {
		// TODO Auto-generated method stub
		System.out.println("Inmate removed from cell.");

	}

	//public void getInmates() {
		// TODO Auto-generated method stub

	//}

	public Inmate getInmate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<Door> getDoors(){
		return _doors;
	}

	protected abstract void printAddedDoor(String door);
		// TODO Auto-generated method stub
		
	


}


