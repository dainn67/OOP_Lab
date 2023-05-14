package hust.soict.ict.lab01;

import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
		
		int otype = JOptionPane.YES_NO_OPTION;
		int mtype = JOptionPane.QUESTION_MESSAGE;
        Object[] options = {"To be", "Not to be"};
        int result = JOptionPane.showOptionDialog(null, "To be or not to be, that is a question",
        		"Terms and Conditions", otype, mtype, null, options, options[0]);
        if (result == JOptionPane.YES_OPTION) JOptionPane.showMessageDialog(null, "To be");
        else JOptionPane.showMessageDialog(null, "Not to be");
		System.exit(0);
	}
}
