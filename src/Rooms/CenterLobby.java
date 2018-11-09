package Rooms;
import People.*;

public class CenterLobby extends Room{
    public CenterLobby(int x,int y)
    {
        super(3,3);
    }

    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You entered the Center lobby. Several lifeless bodies sat there with their eyes widely open, like they tried to see things in this hopeless darkness.");
    }
}
