import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.util.ArrayList;
import java.awt.Color;



/**
 * A <code>ChameleonCritter</code> takes on the color of neighboring actors as
 * it moves through the grid. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class RockHound extends Critter
{
    public void act(){
        rock();
    }
    public void rock(){
        Grid<Actor> gr = getGrid();

        int direction = getDirection();

        Location location = getLocation();

            //Finds the locations of each of the two spaces in front of it
        Location location1 = location.getAdjacentLocation(direction);
        if (gr.get(location1) instanceof Rock) {
            moveTo(location1)
        } else if (getGrid() == null) {
            return;
            ArrayList<Actor> actors = getActors();
            processActors(actors);
            ArrayList<Location> moveLocs = getMoveLocations();
            Location loc = selectMoveLocation(moveLocs);
            makeMove(loc);
        }
      }  
}
