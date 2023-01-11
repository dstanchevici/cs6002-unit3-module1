import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class PalindromeGUI extends JFrame {

    JTextArea textArea;
    JTextField stringField;
    JScrollPane scrollPane;

    public PalindromeGUI ()
    {
        // Set some parameters of the frame (window) that's brought up.
        this.setSize (800, 400);
        this.setTitle ("Palindrome Tester");
        this.setResizable (true);

        // This is how stuff is put into a frame.
	Container cPane = this.getContentPane();
        textArea = new JTextArea ();
	scrollPane = new JScrollPane (textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        cPane.add (scrollPane, BorderLayout.CENTER);
        
        // Make the controls.
        JPanel panel = new JPanel ();
        JLabel label = new JLabel ("Enter a string: ");
        panel.add (label);
        stringField = new JTextField (30);
        panel.add (stringField);
        JButton button = new JButton ("Go");
	button.addActionListener (
	  new ActionListener () {
	      public void actionPerformed (ActionEvent a)
	      {
		  handleButtonClick();
	      }
	  }
        );
        panel.add (button);

        button = new JButton ("Quit");
	button.addActionListener (
	  new ActionListener () {
	      public void actionPerformed (ActionEvent a)
	      {
		  System.exit(0);
	      }
	  }
        );
        panel.add (button);

        cPane.add (panel, BorderLayout.SOUTH);
        
        this.setVisible (true);
    }
    

    String inputStr;


    // When the user clicks the button, this method gets called.
    // It's where we need to respond.

    void handleButtonClick ()
    {
        // Extract the string from the textfield where the user typed the strings.
        inputStr = stringField.getText ();

	String outputStr = textArea.getText();
	if ( checkPalindrome(inputStr) ) {
	    outputStr += inputStr + " is a palindrome\n\n";
	}
	else {
	    outputStr += inputStr + " is NOT a palindrome\n\n";
	}

        // Put the output string in the text box.
	textArea.setText (outputStr);
    }


    static boolean checkPalindrome (String str)
    {
	String strEdited = str.toLowerCase ();

        int start = (int) 'a';
        int end = (int) 'z';
	
	String letters = "";
	for (int i=0; i<strEdited.length(); i++) {
	    for (int j=start; j<=end; j++) {
		if (strEdited.charAt(i) == (char) j) {
		    letters += strEdited.charAt(i);
		}
	    }
	}

	for (int i=0; i<letters.length()/2; i++) {
	    if ( letters.charAt(i) != letters.charAt(letters.length()-1-i) ) {
	        return false;    
	    }
	}
	return true;

    }


    public static void main (String[] argv)
    {
	PalindromeGUI a = new PalindromeGUI ();
    }

}
