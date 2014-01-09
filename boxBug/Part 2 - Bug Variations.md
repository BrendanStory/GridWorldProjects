Set 2 - Did you know?

1. The side length variable sets the maximum spaces that the bug will travel in a direction before turning.
2. Steps is used to track the distance the bug has traveled in order to keep the sidelength correct.
3. The turn method is called twice, because to form a box, it needs to have right angles, and the turn method only makes the bug turn 45 degrees, which it needs to turn 90 degrees in order to make the right angle required.
4. The move method has been carried over from the Bug code, which is shown by the |extends bug| part of the class line. This allows all public methods in bug to be used in boxBug.
5. No, since it may hit a wall, and turn earlier than it normally would. The side length can also be changed to give a different size box.
6. No, since the distances are set before it starts it's path, so unless a rock is placed in the way of the path during its' movement, the size will stay the same.
7. The value of steps will always be 0 after it turns, but before it moves. It is also 0 when the code is first initialized.

Exercises 

1. The bugs form a circle shape instead of a square, and the lengths have to be adujusted to be smaller, since it travels longer distances in each direction, due to the fact that it technically moves the distance asked 3 times instead of one.
2. Shown in Code
3. Shown in Code
4. Shown in Code
5. To add another box bug runner you would copy this code - BoxBug alice = new BoxBug(6);
                                                            alice.setColor(Color.ORANGE);
                                                            world.add(new Location(7, 8), alice);
                                                            
  But you would give it a different name, sideLength, Color, and point on the world. You put this code in the BoxBugRunner.java, in the main method.
