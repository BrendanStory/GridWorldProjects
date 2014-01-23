import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;

import java.awt.Color;

public class JumperRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Jumper bob = new Jumper();
		world.add(new Location(5, 5), bob);
		Rock r = new Rock();
		world.add(r);
		world.show();

	}	

}