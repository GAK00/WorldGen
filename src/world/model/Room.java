package world.model;

import java.awt.Dimension;
import java.util.ArrayList;

public class Room
{
	private ArrayList<Tile> interior;
	private Dimension roomDimension;
	public Room(ArrayList<Tile> interior, Dimension roomDimension)
	{
		this.interior = interior;
		this.roomDimension = roomDimension;
	}

	public Tile getTile(Dimension retriveDimension)
	{
		int index = (int)((retriveDimension.getWidth() * roomDimension.getHeight())+retriveDimension.getHeight());
		return interior.get(index);
	}
}
