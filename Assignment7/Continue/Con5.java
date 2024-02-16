 class Con5 {
    public static void main(String[] args) {
        for (int a = 1; a <= 20; a++) {
            if (a % 4 != 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}