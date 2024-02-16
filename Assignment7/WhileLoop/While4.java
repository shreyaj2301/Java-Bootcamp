 class While4{
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        int a = 1;
        while (a <= n) {
            sum += a;
            a++;
        }
        System.out.println("Sum of 1to 10 numbers is: " + sum);
    }
}