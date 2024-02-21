

// Develop a Java program that displays a simple menu to the user with options (e.g., 1. Add, 2. Subtract, 3. Multiply, 4. Divide). Based on the user's choice, perform the corresponding arithmetic operation using a switch case statement.


import java.util.Scanner;

 class Switch3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Calculator Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
       int num2 = sc.nextInt();

      int result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice! Please choose between 1 to 4.");
        }
    }
}
