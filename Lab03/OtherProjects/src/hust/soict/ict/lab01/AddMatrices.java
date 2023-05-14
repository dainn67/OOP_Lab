package hust.soict.ict.lab01;

import java.util.Scanner;

public class AddMatrices {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = scanner.nextInt();
		System.out.print("Enter number of columns: ");
		int col = scanner.nextInt();
		int[][] m1 = new int[row][col];
		int[][] m2 = new int[row][col];
		int[][] res = new int[row][col];
		
		System.out.println("\n1st matrix");
		for(int i=0; i<row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print("a[" + (i+1) + "][" + (j+1) + "] = ");
				m1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("\n2nd matrix");
		for(int i=0; i<row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print("a[" + (i+1) + "][" + (j+1) + "] = ");
				m2[i][j] = scanner.nextInt();
				
				res[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		System.out.println("\nResult");
		for(int i=0; i<row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
}
