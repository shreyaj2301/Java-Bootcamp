 class While7 {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 20) {
            if (a % 2 == 0 && a % 3 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}