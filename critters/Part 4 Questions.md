GridWorldProjects
=================

Set 7
  1. getActors, processActors, getMoveLocations, selectMoveLocation, makeMove
  3. No, if they need to change something, they should extend those methods
  4. Check the color of the actor, check the type of actor, and check the 
  5. super.move, - run the move command from earlier where you move and place a flower, makeMove, - check to see where you can come and then move to a random one of the open locations, moveTo - go to a specific point on the grid at any time.
  6. Because they are constructed in the critterLauncher code
  
Set 8
  1. Because it adds bonus parts to critter that don't exist in the normal critter java code.
  2. So the code for makeMove doesn't need to be rewritten
  3. Use super.move from the bug code.
  4. Because the other actors don't change what it does, so it doesn't care where they are after it finds where they are the first time.
  5. getMoveLocations
  6. using the getGrid command
  
Set 9
  1.
  2. No, because it wont eat rocks. It trys to find specific actors and which direction they are from the actor
  3. Because it can only move left and right.
  4. 2,3 || 3,3 || 4,3 || 1,4 || 2,4 || 4,4 || 5,4 || 2,5 || 3,5 || 4,5
  5. They both move randomly when no actors are nearby
  6. If it can't move, or if it can't reach an actor by moving the and rightt
  7. Because the code tells them which actors to 'eat', so they don't end up eating things like rocks.
