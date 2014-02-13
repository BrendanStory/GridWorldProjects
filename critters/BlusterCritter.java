import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.util.ArrayList;
import java.awt.Color;

class BlusterCritter extends Critter {

	private static final double BRIGHTENING_FACTOR = 0.15;
	private static final double DARKENING_FACTOR = 0.45;

	public ArrayList<Actor> getActors() { 
	    ArrayList<Actor> actors = new ArrayList<Actor>();
	    int[] dirs =
	        { Location.AHEAD, Location.HALF_CIRCLE};
	    for (Location loc : getLocationsInDirections(dirs))
	    {
	        Actor a = getGrid().get(loc);
	        if (a != null){
	            actors.add(a);
	        }
	     }

	     return actors;
	 }

	public void processActors(ArrayList<Actor> actors) {

		int n = actors.size();

		if (n <= 0) {

		    Color c = getColor();

		    	
		    
		    int red = (int) (c.getRed());
		    int green = (int) (c.getGreen());
		    int blue = (int) (c.getBlue());

		    if (red >= 222) {
		    	red = 255;
		    } else {
		    	red = (int) (red * (1 + BRIGHTENING_FACTOR));
		    }

		    if (green >= 222) {
		    	green = 255;
		    } else {
		    	green = (int) (green * (1 + BRIGHTENING_FACTOR));
		    }
		   
		   	if (blue >= 222) {
		   		blue = 255;
		   	} else {
		   		blue = (int) (red * (1 + BRIGHTENING_FACTOR));
		   	}

		    setColor(new Color(red, green, blue));

		    return;

		} else {

			Color c = getColor();

			int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
			int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
			int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

			setColor(new Color(red, green, blue));

			return;

		}


	}

	public ArrayList<Location> getLocationsInDirections(int[] directions)
	{
	    ArrayList<Location> locs = new ArrayList<Location>();
	    Grid gr = getGrid();
	    Location loc = getLocation();
	
	    for (int d : directions)
	    {
	        Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
	        if (gr.isValid(neighborLoc))
	            locs.add(neighborLoc);
	    }
	    return locs;
	} 


}