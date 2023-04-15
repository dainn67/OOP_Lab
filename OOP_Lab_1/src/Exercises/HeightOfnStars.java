package Exercises;
import java.util.Scanner;

public class HeightOfnStars {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Enter number of rows: ");
    	int n = scanner.nextInt();
    	String resString = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) resString += " ";
            for (int k = 1; k <= 2 * i - 1; k++) resString += "*";
            resString += "\n";
        }
        System.out.print(resString);
    }
}
