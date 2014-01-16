import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner {
    
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        DancingBug bob = new DancingBug(3,7,4);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}