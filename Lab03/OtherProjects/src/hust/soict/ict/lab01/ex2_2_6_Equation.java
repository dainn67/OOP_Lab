package hust.soict.ict.lab01;

import java.util.Scanner;

public class ex2_2_6_Equation {
	void linear_equation(Scanner sc) {
		double a, b;
		System.out.println("Linear equation: ax + b = 0");
		System.out.print("Enter a: ");
		a = sc.nextDouble();
		System.out.print("Enter b: ");
		b = sc.nextDouble();
		
		if(a == 0 && b != 0) {
			System.out.println("Invalid operation\n" + b + " = 0");
		}else if(a == 0 && b == 0) {
			System.out.println("Solution: all real value");
		}else {
			System.out.println("Solution: x = " + (-b/a));
		}
	}
	
	void linear_system(Scanner sc) {
		double a11, a12, a21, a22, b1, b2;
		System.out.println("\n\na11x1 + a12x2 = b1, a21x1 + a22x2 = b2");
		System.out.print("Enter a11: ");
		a11 = sc.nextDouble();
		System.out.print("Enter a12: ");
		a12 = sc.nextDouble();
		System.out.print("Enter a21: ");
		a21 = sc.nextDouble();
		System.out.print("Enter a22: ");
		a22 = sc.nextDouble();
		System.out.print("Enter b1: ");
		b1 = sc.nextDouble();
		System.out.print("Enter b2: ");
		b2 = sc.nextDouble();
		
		double D = a11 * a22 - a12 * a21;
		double Dx = b1 * a22 - b2 * a12;
		double Dy = a11 * b2 - a21 * b1;
		
		if(D != 0) {
			System.out.println("Solution:\nx1 = " + Dx/D + "\nx2 = " + Dy/D);
		}else {
			if(Dx != 0 && Dy != 0) System.out.println("No solution");
			else if(Dx == 0 && Dy == 0) System.out.println("Solution\nall x satisfy: " + a11 + "x1 + " + a12 +"x2 = " + b1);
		}
	}
	
	void second_degree_equation(Scanner sc) {
		double a, b, c;
		System.out.println("\n\nax^2 + bx + c = 0");
		System.out.print("Enter a: ");
		a = sc.nextDouble();
		System.out.print("Enter b: ");
		b = sc.nextDouble();
		System.out.print("Enter c: ");
		c = sc.nextDouble();
		
		double delta = b * b - 4 * a * c;
		if(delta < 0) System.out.println("No solution");
		else if(delta == 0) System.out.println("Solution: x = " + (-b/(2 * a)));
		else System.out.println("Solution\nx1 = " + ((-b - Math.sqrt(delta))/(2 * a)) +
				"\nx2 = " + ((-b + Math.sqrt(delta))/(2 * a)));
	}
	
	public static void main(String[] args) {
		ex2_2_6_Equation equation = new ex2_2_6_Equation();
		Scanner scanner = new Scanner(System.in);
		//
		equation.linear_equation(scanner);
		equation.linear_system(scanner);
		equation.second_degree_equation(scanner);
		
		
		
	}
	
	
}
