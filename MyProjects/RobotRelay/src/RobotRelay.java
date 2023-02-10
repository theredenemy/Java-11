import becker.robots.*;

public class RobotRelay {

    public static void main(String[] args) {
    // Set up the initial situation
		City beijing = new City();   // constructs a City object
		Robot ben = new Robot(beijing, 2, 0, Direction.SOUTH);  // constructs 2
		Robot karel = new Robot(beijing, 2, 3, Direction.SOUTH);// Robot objects
		Thing baton = new Thing(beijing, 3, 0);  // instantiate (construct) a Thing object
		Wall finishLine = new Wall(beijing, 3, 6, Direction.EAST);	// constructs a?
		Thing box = new Thing(beijing, 2, 4, Direction.EAST);
		karel.setLabel("K");  // karel is calling setLabel to place a K on the image of itself.
		ben.setLabel("B");    // ben is calling setLabel to place a B on the image of itself.

		// Run the relay. These are the services used to control the robots.
		ben.move();  // causes ben to move forward by one
		ben.turnLeft();  // causes ben to turn left
		ben.pickThing();  // causes ben to pick up a Thing at the location he is at
		ben.move();
		ben.move();
		ben.move();
		ben.putThing();  // causes ben to place a Thing at the location he is at
		ben.move();
		ben.turnLeft();
		ben.move();



		karel.move();
		karel.turnLeft();
		karel.pickThing();
		karel.move();
		karel.move();
		karel.move();
		karel.putThing();

    }
}
