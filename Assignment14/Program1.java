class Program1 {

    public static void main(String[] args) {
        // pattern();
        patternRange(0, 5);
    }

    static void isPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            isPattern(); // Call isPattern method to print the pattern
            System.out.println(i); // Print the number i
        }
    }
}