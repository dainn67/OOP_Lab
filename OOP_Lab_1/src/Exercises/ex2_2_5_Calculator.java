package Exercises;

import javax.swing.JOptionPane;

public class ex2_2_5_Calculator {
	public static void main(String[] args) {
		String s1, s2;

		s1 = JOptionPane.showInputDialog(null, "Enter the first number: ", "Enter the first number",
				JOptionPane.INFORMATION_MESSAGE);
		s2 = JOptionPane.showInputDialog(null, "Enter the second number: ", "Enter the second number",
				JOptionPane.INFORMATION_MESSAGE);

		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);

		double sum = n1 + n2;
		double difference = (n1 > n2) ? n1 - n2 : n2 - n1;
		double product = n1 * n2;
		double quotient;
		
		String resString;
		
		if(n2 != 0) {
			quotient = n1/n2;
			resString = "Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + 
					"\nQuotient: " + quotient;
		}
		else {
			resString = "Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product +
					"\nQuotient: Second number is 0, can not divide";
		}
		
		

		JOptionPane.showMessageDialog(null, resString, "Result", JOptionPane.INFORMATION_MESSAGE);
	}
}
