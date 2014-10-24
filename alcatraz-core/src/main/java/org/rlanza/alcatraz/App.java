package org.rlanza.alcatraz;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
// error de null point exception?? wtf!!!
public class App {

	public static void main(String[] args) {

		ArrayList<Inmate> newinmates = new ArrayList<Inmate>();
		Hallway hallway1 = new Hallway("hallway1");
		Cell cell1 = new Cell("cell1");
		Door door1 = new Door(cell1, hallway1, "C01");
		hallway1.addDoor(door1);
		cell1.addDoor(door1);
		// Door mainGate = new Door(hallway1,out);// hallway + out of prission??
		Inmate inmate1 = new Inmate(1, cell1);
		newinmates.add(inmate1);
		Inmate inmate2 = new Inmate(2, cell1);
		newinmates.add(inmate2);
		cell1.addInmates(newinmates);
		Guard guard1 = new Guard("G01");

		inmate1.beginEscape();
		guard1.setPlace(hallway1);
		guard1.beginwatch();
	}
}
