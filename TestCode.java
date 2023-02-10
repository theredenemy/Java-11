import becker.robots.*;

public class TestCode
{

   public static void main(String[] args)
   {

City chilliwack = new City();
      Robot murtha = new Robot(chilliwack, 3, 4, Direction.WEST);
      murtha.setLabel("TEST");

murtha.move();
murtha.turnLeft();
	  murtha.move();
	   murtha.move();
        murtha.turnLeft();
         murtha.move();



   }
}

