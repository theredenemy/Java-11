import becker.robots.*;
 // Corbin Feasby
public class Trace {
}
    public static void main(String[] args) {
   }
   	City paris = new City();
}   Thing theThing = new Thing(paris, 1, 2,);
    Wall w = new Wall(paris, 1, 2, Direction.WEST);
    Robot karel = new Robot(paris, 1, 0, Direction.EAST);

karel.move();
karel.turnLeft();
karel.turnLeft();
karel.turnLeft();
karel.move();
karel.turnLeft();
karel.move();
karel.turnLeft();
karel.move();
karel.turnLeft();
karel.pickThing();
karel.move();
   }
}