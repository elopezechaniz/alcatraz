package org.rlanza.alcatraz;

public class Cell extends Room {

	public Cell(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void printRemovedInmate(Inmate inmate) {
		// TODO Auto-generated method stub
		System.out.println("inmate " + inmate.getNumber()
				+ " has been removed from cell " + getCode());

	}

	public Door getDoor() {
		return super.getDoors().get(0);
	}

	@Override
	protected void printAddedDoor(String code) {
		// TODO Auto-generated method stub
		System.out.println("Door " + code
				+ " has been added to Cell " + getCode());

	}
}