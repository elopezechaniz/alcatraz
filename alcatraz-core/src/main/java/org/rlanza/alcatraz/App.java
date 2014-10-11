package org.rlanza.alcatraz;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Inmate inmate1 = new Inmate();
		Inmate inmate2 = new Inmate();
		Guard guard1 = new Guard();
		Hallway hallway1 = new Hallway();
		Cell cell1 = new Cell();
		Door mainGate = new Door();
		
		
		inmate1.setPlace(cell1);
		inmate1.beginEscape();
		guard1.setPlace(hallway1);
		guard1.beginwatch();
	}
}
