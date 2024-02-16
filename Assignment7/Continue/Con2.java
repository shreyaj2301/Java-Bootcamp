 class Con2 {
    public static void main(String[] args) {
        // it gives the out put without the multiple of 3
        for (int a = 1; a <= 10; a++) {
            if (a % 3 == 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}