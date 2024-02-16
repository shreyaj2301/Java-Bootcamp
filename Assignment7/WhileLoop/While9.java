class While9 {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 30) {
            if (a % 2 == 0 && a % 3 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}