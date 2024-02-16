class While6 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 10) {
            if (a % 2 != 0) {
                sum += a;
            }
            a++;
        }
        System.out.println("Sum of odd numbers: " + sum);
    }
}