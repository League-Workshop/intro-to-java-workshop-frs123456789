package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell (mandlebrot)"
speak("Mandlebrot");
		// 2. Catch the user's answer in a String
String c3po = JOptionPane.showInputDialog("How do you spell it?");
		// 3. If the user spelled the word correctly, speak "correct"
if(c3po.equals("mandlebrot")){
	speak("CORRECT BRO!!!");
		// 4. Otherwise say "wrong"
}
	else { JOptionPane.showMessageDialog(null,"WRONG WROND WRONG");
		// 5. repeat the process for other words
	}
	
		// 1. Use the speak method to say the word. "e.g. spell (mandlebrot)"
speak("Trump");
		// 2. Catch the user's answer in a String
String boi = JOptionPane.showInputDialog("How do you spell it?");
		// 3. If the user spelled the word correctly, speak "correct"
if(boi.equals("Trump")){
	speak("CORRECT BRO!!!");
		// 4. Otherwise say "wrong"
}
	else { speak("WRONG WRONG WRONG");
		// 5. repeat the process for other words
	
	}
	
	
	
	// 1. Use the speak method to say the word. "e.g. spell (mandlebrot)"
	speak("Hillary Clinton");
			// 2. Catch the user's answer in a String
	String boy = JOptionPane.showInputDialog("How do you spell it?");
			// 3. If the user spelled the word correctly, speak "correct"
	if(boy.equals("Hillary Clinton")){
		speak("CORRECT BRO!!!");
			// 4. Otherwise say "wrong"
	}
	// 1. Use the speak method to say the word. "e.g. spell (mandlebrot)"
	speak("Trump");
			// 2. Catch the user's answer in a String
	String hi = JOptionPane.showInputDialog("How do you spell it?");
			// 3. If the user spelled the word correctly, speak "correct"
	if(hi.equals("Trump")){
		speak("CORRECT BRO!!!");
			// 4. Otherwise say "wrong"
	}
		else { JOptionPane.showMessageDialog(null,"WRONG WROND WRONG");
			// 5. repeat the process for other words
		
		}
		
		}
			// 5. repeat the process for other words
		
		
		
		
	


	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


}