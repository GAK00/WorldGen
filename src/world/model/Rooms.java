package world.model;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

public class Rooms
{
	private int[] left = { -1, 0 };
	private int[] up = { 0, 1 };
	private int[] right = { 1, 0 };
	private int[] down = { 0, -1 };
	private Dimension standered = new Dimension(7, 7);
	private Wall wall = new Wall(new Color(61, 61, 61));
	private Floor floor = new Floor(new Color(109, 109, 109));
	private Exit leftDoor = new Exit(left, floor);
	private Exit upDoor = new Exit(up, floor);
	private Exit rightDoor = new Exit(right, floor);
	private Exit downDoor = new Exit(down, floor);

	public Room getLeftTurnToUp()
	{
		Room rightTurnToUp = new Room(buildLeftTurnToUp(), standered);
		return rightTurnToUp;
	}

	public ArrayList<Tile> buildLeftTurnToUp()
	{
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		// row 1
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(leftDoor);
		tiles.add(wall);
		tiles.add(wall);
		// row 2
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		// row 3
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		// row 4
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		// row 5
		tiles.add(upDoor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		// row 6
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		// row 7
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);

		return tiles;

	}

	public Room getDownTurnToLeft()
	{
		Room rightTurnToUp = new Room(buildDownTurnToLeft(), standered);
		return rightTurnToUp;
	}

	public ArrayList<Tile> buildDownTurnToLeft()
	{
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		// row 1
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(leftDoor);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		// row 2
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		// row 3
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		// row 4
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		// row 5
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(downDoor);
		// row 6
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		// row 7
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);

		return tiles;

	}

	public Room getRightTurnToDown()
	{
		Room rightTurnToUp = new Room(buildRightTurnToDown(), standered);
		return rightTurnToUp;
	}

	public ArrayList<Tile> buildRightTurnToDown()
	{
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		// row 1
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(leftDoor);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		// row 2
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		// row 3
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		// row 4
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		// row 5
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(downDoor);
		// row 6
		tiles.add(wall);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(floor);
		tiles.add(wall);
		// row 7
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);
		tiles.add(wall);

		return tiles;

	}
}
