package Board;
import Rooms.*;

public class Map
{
    private int col;
    private int row;


    public void Map(Room[][] building) {
        for (int x = 0; x < building.length; x++) {
            for (int y = 0; y < building[x].length; y++) {
                building[x][y] = building[col][row];
            }

        }

    }



}
