package Game;

import People.Person;
import Rooms.Cafeteria;
import Rooms.Room;
import Rooms.WinningRoom;
import Board.Map;
import java.util.Scanner;

public class Runner {
	

	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		System.out.println("\tOnly a minority of people were able to move into underground shelters before the Great nuclear war started. 50 years later, you,who was born and grew up in the shelter, was asked to find out what happened in another shelter since it no longer sending signal to other shelters.\n You found that the entry of the shelter had blocked by rocks,like an earthquake had occurred in this area. But you still found a way to get into the shelter. ");
		Room[][] building = new Room[5][5];

		
		//Fill the building with normal rooms
		for (int x = 0; x<building.length; x++)
		{
			for (int y = 0; y < building[x].length; y++)
			{
				building[x][y] = new Room(x,y);
			}
		}



		building[2][2] = new WinningRoom(2,2 );
		//build a cafeteria
		building[1][1]=new Cafeteria(1, 1);

		 
		 //Setup player 1 and the input scanner
		Person player1 = new Person("FirstName", "FamilyName", 0,0);
		building[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);



		while(gameOn)
		{
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if(validMove(move, player1, building))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else if(move.equalsIgnoreCase("map"))
			{
				System.out.println(building);

			}
			else if(move.equalsIgnoreCase("help"))
			{
				System.out.println("map-shows the location of the player\n\tbackpack-shows items in the player's backpack\n\tn-moves the player to the North\n\ts-moves the player to the South\n\te-moves the player to the East\n\tw-moves the player to the West");
			}
			else
			{
				System.out.println("Please choose a valid move.");
			}
			
		}

		in.close();
	}

	/**
	 * Checks that the movement chosen is within the valid game map.
	 * @param move the move chosen
	 * @param p person moving
	 * @param map the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	


}
