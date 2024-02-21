
// Implement a Java program that takes an integer representing a day number (1 for Sunday, 2 for Monday, etc.) and prints the corresponding day of the week using a switch case statement.

import java.util.Scanner;
 class Switch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day number (1-7): ");
        int dayNumber = sc.nextInt();

        String dayOfWeek;

        switch (dayNumber) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid day number";
        }

        System.out.println("Day of the week: " + dayOfWeek);
    }
}
