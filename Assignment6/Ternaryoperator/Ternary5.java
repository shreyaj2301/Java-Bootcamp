 class Ternary5
 {
    public static void main(String[] args) {
        int number = -10;
        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println("The number is " + result + ".");
    }
}