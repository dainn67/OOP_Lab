package Exercises;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter month: ");

		boolean check = false;
		int month = 0;
		String _month;
		
		do {
			_month = keyboard.nextLine();
			try {				
				month = Integer.parseInt(_month);
				if(1 <= month && month <= 12) check = true;
			} catch (NumberFormatException e) {
				if(_month.equals("January") || _month.equals("Jan")
						|| _month.equals("Febuary") || _month.equals("Feb") || _month.equals("Feb.")
						|| _month.equals("March")|| _month.equals("Mar")|| _month.equals("Mar.")
						|| _month.equals("April")|| _month.equals("Apr")|| _month.equals("Apr.")
						|| _month.equals("May")|| _month.equals("May.")
						|| _month.equals("June")|| _month.equals("Jun")|| _month.equals("Jun.")
						|| _month.equals("July")|| _month.equals("Jul")|| _month.equals("Jul.")
						|| _month.equals("August")|| _month.equals("Aug")|| _month.equals("Aug.")
						|| _month.equals("September")|| _month.equals("Sep")|| _month.equals("Sep.")
						|| _month.equals("October")|| _month.equals("Oct")|| _month.equals("Oct.")
						|| _month.equals("November")|| _month.equals("Nov")|| _month.equals("Nov.")
						|| _month.equals("December")|| _month.equals("Dec")|| _month.equals("Dec.")
						) check = true;
			}
		} while (!check);
		
		
		System.out.print("Enter year: ");
		int year = keyboard.nextInt();
		while (year < 0 || 1000 > year || year > 9999) {
			System.out.println("Invalid year\n1Enter again: ");
			year = keyboard.nextInt();
		}
		
		boolean isLeapYear = false;
		if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
		}
		
		if(1 <= month && month <=12) {			
			switch (month){
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println("31 days");
			break;
			case 4, 6, 9, 11:
				System.out.println("30 days");
			break;
			case 2:
				if(isLeapYear) System.out.println("29 days");
				else System.out.println("28 days");
			}
		}else {
			switch (_month) {
				case "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec":
					System.out.println("31 days");
					break;
				case "Apr", "Jun", "Sep", "Nov":
					System.out.println("31 days");
					break;
				case "Feb", "Febuary", "Feb.":
					if(isLeapYear) System.out.println("29 days");
					else System.out.println("28 days");
			}
		}
	}
}
