//Adapted from...
//G. Wijesinghe, "Tutorial 1", Rmit.instructure.com, 2019. [Online]. 
//Available: https://rmit.instructure.com/courses/56572/assignments/334735. [Accessed: 29- May- 2019].

import javax.swing.JOptionPane;

// Comment?!
//This code displays a pop-up message containing the following strings.
//Class: the container of code that can be called upon to execute
public class Myself {
	// Method: A method is the step by step process that needs to be performed to
	// execute a task
	public static void main(String[] args) {
		String message; // message is a variable of the String type.
		// Variables store data values.
		// String stores text, int stores integers, float stores floating point numbers,
		// char stores single characters, boolean stores values with two states
		message = "";
		message = message + "Hello world!\n";
		message = message + "My hobbies are playing music, computer games and graphic design \n";
		message = message + "Programming can be used to pop up this dialog box!\n";
		message = message
				+ "It can also be used to make music, script my aimbot, and convert raster files to vector files. \n";
		JOptionPane.showMessageDialog(null, message);
	}
}
