package Rooms;
import People.Person;

public class genjie extends Room{


    public genjie(int x, int y) {
        super(x, y);

    }
    public void enterRoom(Person x)
    {
        System.out.println("");
        occupant=x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void leaveRoom(Person x)
    {
        occupant=null;
    }
}
