 class Break4 {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            if (a % 2 == 0 && a % 3 == 0) {
                System.out.println("Number divisible by both 2 and 3 found: " + a);
                break;
            }
        }
    }
}