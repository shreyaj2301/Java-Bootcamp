 class Ifelselsmall {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 15;
        int smallest;

        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        System.out.println("Smallest number is: " + smallest);
    }
}