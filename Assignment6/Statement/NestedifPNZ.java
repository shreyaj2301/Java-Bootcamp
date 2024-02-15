 class NestedifPNZ{
    public static void main(String[] args) {
        int number = -10;

        if (number >= 0) {
            if (number > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is zero.");
            }
        } else {
            System.out.println("The number is negative.");
        }
    }
}