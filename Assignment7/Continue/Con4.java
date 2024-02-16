 class Con4 {
    public static void main(String[] args) {
        for (int a = 1; a <= 20; a++) {
            if (a % 2 != 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}
// it gives even number