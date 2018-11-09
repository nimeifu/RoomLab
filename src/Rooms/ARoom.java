package Rooms;

import People.Person;

public class ARoom extends Room{

    public ARoom(int x, int y) {
        super(4, 4);
    }

    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You entered a room. Although you knew everything that related to electricity had been destroyed in this earthquake,but you could feel an electrical device is operating and it is constantly sending a very week signal.");
    }
}
