package hust.soict.ict.lab01;

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotificationString = "You've just entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotificationString += strNum1 + " and ";
		
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Imput the second number",
				JOptionPane.INFORMATION_MESSAGE);
		
		strNotificationString += strNum2;
		
		JOptionPane.showMessageDialog(null, strNotificationString, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
