package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		Random c3po = new Random();
		int x = c3po.nextInt(4);

		// 3. Print out this variable
		System.out.println(x);
		// 4. Get the user to enter something that they think is awesome
		String input = JOptionPane.showInputDialog(null, "enter something that they think is awesome");
		// 5. If the random number is 0
		if (x==0) {
			JOptionPane.showMessageDialog(null,"("+ input +")  That's AWESOME!!!");
		}
		// -- tell the user whatever they entered is awesome!

		// 6. If the random number is 1
		if (x==1) {
			JOptionPane.showMessageDialog(null, "("+ input + " is Okay");
		}
		// -- tell the user whatever they entered is ok.

		// 7. If the random number is 2
		if (x==2) {
			JOptionPane.showMessageDialog(null, "("+ input + " IS BORING!!!");
		}
		// -- tell the user whatever they entered is boring.

		// 8. If the random number is 3
		if (x==3) {
			JOptionPane.showMessageDialog(null, "("+ input + " is 10 out of 10");
		}  
		// -- write your own answer

	}
}
