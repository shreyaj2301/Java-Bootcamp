 class Break5 {
    public static void main(String[] args) {
        for (int a = 1; a <= 50; a++) {
            if (a % 5 == 0 || a % 7 == 0) {
                System.out.println("Number which is a multiple of either 5 or 7 found: " + a);
              break;
            }
        }
    }
}
