package Rooms;
import People.*;
import Game.Runner;

public class Cafeteria extends Room{


    public Cafeteria(int x, int y) {
        super(x, y);
    }

    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have entered the cafeteria and had discovered a ");
    }

}