import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class SpiralBugRunner {
    
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        SpiralBug bob = new SpiralBug(1);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}