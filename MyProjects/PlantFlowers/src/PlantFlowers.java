import becker.robots.*;

public class PlantFlowers
{
	public static void main(String[ ] args)
	{
		City berlin = new City();
		Wall eWall = new Wall(berlin, 1, 2, Direction.EAST);
		Wall nWall = new Wall(berlin, 1, 2, Direction.NORTH);
		Wall wWall = new Wall(berlin, 1, 2, Direction.WEST);
		Wall sWall = new Wall(berlin, 1, 2, Direction.SOUTH);

		Robot karel = new Robot(berlin, 0, 1, Direction.SOUTH, 8);

		karel.move();
		karel.putThing();
		karel.move();
		karel.putThing();
		karel.turnLeft();

		karel.move();
		karel.putThing();
		karel.move();
		karel.putThing();
		karel.turnLeft();

		karel.move();
		karel.putThing();
		karel.move();
		karel.putThing();
		karel.turnLeft();

		karel.move();
		karel.putThing();
		karel.move();
		karel.putThing();
		karel.turnLeft();
	}
}



