package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
Robot c3po = new Robot();         

	void go() {
		c3po.setSpeed(200000000);

		c3po.setPenWidth(100);
		for(int i=0;i<5;i++) {

			c3po.setRandomPenColor();
	
			drawSquare();
	
			c3po.turn(90);
			}}



	void drawSquare() {
	c3po.setSpeed(200);
	c3po.penDown();
	c3po.move(100);
	c3po.turn(90);
	c3po.move(100);
	c3po.turn(90);
	c3po.move(100);
	c3po.turn(90);
	c3po.move(100);
	c3po.turn(90);
		

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



