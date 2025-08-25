package Task2;

import java.util.Scanner;


public class CheckDaysInMonth {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month name (e.g., January): ");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            Month month = Month.valueOf(input);
            int days = getDaysInMonth(month);
            System.out.println("Number of days in " + input + " is: " + days);
        } catch (IllegalArgumentException e) {
            try {
                throw new InvalidMonthException("Invalid Month Exception -> Not a valid month");
            } catch (InvalidMonthException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println("Program executed successfully.");
        scanner.close();
    }

   
    public static int getDaysInMonth(Month month) {
        switch (month) {
            case JANUARY: case MARCH: case MAY: case JULY:
            case AUGUST: case OCTOBER: case DECEMBER:
                return 31;
            case APRIL: case JUNE: case SEPTEMBER: case NOVEMBER:
                return 30;
            case FEBRUARY:
                return 28; // You can enhance this for leap years later
            default:
                return 0;
        }
    }
}


