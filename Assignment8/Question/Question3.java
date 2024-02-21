

//Write a program to whether a number is multiple of 5 or not

import java.util.Scanner;

 class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 5 == 0) {
            System.out.println(number + " is a multiple of 5.");
        } else {
            System.out.println(number + " is not a multiple of 5.");
        }
    }
}
