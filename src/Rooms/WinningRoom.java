package Rooms;

import Game.Runner;
import People.Person;

public class WinningRoom extends Room
{

	public WinningRoom(int x, int y) {
		super(5, 5);

	}

	/**
	 * Triggers the game ending conditions.
	 * @param x the Person entering
	 */
	@Override
	public void enterRoom(Person x) {

		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You entered a computer lab, and found a computer in the middle of the lab.");
		Runner.gameOff();
	}
	

}
