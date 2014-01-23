import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

public class Jumper extends Bug{

	public static final int NORTH = 0;
	public static final int EAST = 90;
	public static final int SOUTH = 180;
	public static final int WEST = 270;
	public static final int NORTHEAST = 45;
	public static final int SOUTHEAST = 135;
	public static final int SOUTHWEST = 225;
	public static final int NORTHWEST = 315;

	public Jumper(){

	}

	public void act(){
		jump();
		
		
	}



	public void jump(){
		Grid<Actor> gr = getGrid();

		int direction = getDirection();

		Location location = getLocation();

			//Finds the locations of each of the two spaces in front of it
		Location location1 = location.getAdjacentLocation(direction);
		Location location2 = location1.getAdjacentLocation(direction);

			//Checks to make sure the grid location it will jump to is vaild
		if (!gr.isValid(location2)) {
			turn();

			//Checks to make sure there is no rock or flower where it will move to or juup to
		} else if (gr.get(location2) instanceof Rock || gr.get(location2) instanceof Flower ){
			turn();

			//Checks to see if anything is in front of it so it knows to jump
		} else if (gr.isValid(location2) && gr.get(location1) instanceof Rock || gr.get(location1) instanceof Flower){
			moveTo(location2);

			//Else moves two spaces and leaves behind flowers
		} else {
			move();
			move();
		}

	}

}