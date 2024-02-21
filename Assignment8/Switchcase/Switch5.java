
// Create a Java program that takes a numerical grade as input from the user and converts it to a letter grade (A, B, C, D, or F) using a switch case statement. The grading scale can be based on typical academic standards.

import java.util.Scanner;

 class Switch5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numerical grade: ");
        int a = sc.nextInt();

        char letterGrade;

        switch (a / 10) {
     
            case 9:
                letterGrade = 'A';
                break;
            case 8:
                letterGrade = 'B';
                break;
            case 7:
                letterGrade = 'C';
                break;
            case 6:
                letterGrade = 'D';
                break;
            default:
                letterGrade = 'F';
        }

        System.out.println("Letter grade: " + letterGrade);
    }
}
