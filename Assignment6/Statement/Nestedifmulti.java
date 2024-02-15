 class Nestedifmulti {
    public static void main(String[] args) {
        int number = 15;
        int multiplier = 3;

        if (number % multiplier == 0) {
            System.out.println(number + " is a multiple of " + multiplier + ".");
        } else {
            if (number % multiplier != 0) {
                System.out.println(number + " is not a multiple of " + multiplier + ".");
            }
        }
    }
}