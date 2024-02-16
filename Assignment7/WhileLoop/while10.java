 class While10 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 20) {
            if (a % 2 == 0 || a % 3 == 0) {
                sum += a;
            }
            a++;
        }
        System.out.println("Sum: " + sum);
    }
}