package section2;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		Robot c3po = new Robot();
		c3po.penDown();
		

		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		c3po.setX(450);
		c3po.setY(270);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10
		c3po.setSpeed(10000);
	
		// 13. Use a for loop to repeat all of the code below 25 times
        for(int i=0;i<100000;i++) {
        	
        	//turn 1/8 of a circle
			c3po.turn(45);
		
			// 3. Move the robot 64 pixels
			c3po.move(64);

			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			c3po.turn(-40);
			
			// 5. Move the robot the distance in the variable flameSize
			c3po.move(flameSize);
			
			// 6. Turn the robot 170 degrees
			c3po.turn(170);
			
			// 7. Move the robot the distance in the variable flameSize (again)
			c3po.move(flameSize);
			
			// 8. Turn the robot 64 degrees to the right
			c3po.turn(64);
			
			// 9. Move the robot the distance in the variable baseSize
			c3po.move(baseSize);
			
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
				c3po.setRandomPenColor();

		
	}

}}


