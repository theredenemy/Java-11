import becker.robots.*;

public class Mountain
{
  public static void main(String[] args)
  {
City sardis = new City();
   Robot karel = new Robot(sardis, 3, 0, Direction.EAST);
   Wall w0 = new Wall(sardis, 1, 1, Direction.NORTH);
   Wall w1 = new Wall(sardis, 1, 1, Direction.WEST);

karel.turnLeft();
karel.turnLeft();
karel.turnLeft();
karel.move();
karel.turnLeft();
karel.move();

   }

 }



