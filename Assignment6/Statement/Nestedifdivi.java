class Nestedifdivi {
    public static void main(String[] args) {
        int number = 12;

        if (number % 2 == 0) {
            if (number % 3 == 0) {
                System.out.println("The number is divisible by both 2 and 3.");
            } else {
                System.out.println("The number is divisible by 2 but not by 3.");
            }
        } else {
            System.out.println("The number is not divisible by 2.");
        }
    }
}