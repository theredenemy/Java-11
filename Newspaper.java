import becker.robots.*;

public class Newspaper
{
  public static void main(String[] args)
  {
City home = new City();
   Robot karel = new Robot(home, 1, 2, Direction.SOUTH);
   Thing Newspaper = new Thing(home, 2, 2, Direction.SOUTH);
   Wall w0 = new Wall(home, 1, 1, Direction.NORTH);
   Wall w1 = new Wall(home, 1, 1, Direction.WEST);
   Wall w2 = new Wall(home, 2, 1, Direction.SOUTH);
   Wall w3 = new Wall(home, 1, 2, Direction.NORTH);
   Wall w4 = new Wall(home, 1, 2, Direction.SOUTH);
   Wall w5 = new Wall(home, 2, 1, Direction.WEST);
   Wall w6 = new Wall(home, 1, 2, Direction.EAST);
// why does this not work
// this code is bad
karel.turnLeft();
karel.turnLeft();
karel.turnLeft();
karel.move();
karel.turnLeft();
karel.move();
karel.turnLeft();
karel.move();
karel.pickThing();
karel.turnLeft();
karel.turnLeft();
karel.move();
karel.turnLeft();
karel.turnLeft();
karel.turnLeft();
karel.move();
karel.turnLeft();
karel.turnLeft();
karel.turnLeft();
karel.move();
karel.turnLeft();
karel.turnLeft();
karel.turnLeft();
karel.putThing();

   }

 }



