import info.gridworld.actor.Bug;

public class DancingBug extends Bug{
	
	private int[] danceTurns;

	public DancingBug(int[] dance){

		danceTurns = dance;
	}

	public void act(){

		for (int i = 0; i <= danceTurns.length; i++) {
			for (int k = danceTurns[i]; k > 0; k--) {
				turn();
			}
			move();
		}
		act();
	}

} 