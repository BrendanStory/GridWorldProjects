
import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int counter;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
        counter = 0;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if(counter == 0){
        turn();
        turn();
        }  
         
        while(counter < 3){
            if (steps < sideLength && canMove())
            {
                move();
                steps++;
            }
            else if(counter == 0 )
            {
                turn();
                turn();
                turn();
                steps = 0;
                counter++;
            }  else if (counter == 1){
                turn();
                turn();
                turn();
                turn();
                turn();
                steps = 0;
                counter++;
            } else if (counter == 2){
                move();
                counter++;
            } else{

            }
        }
    }
}
