 class Dowhile3 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1;
        do {
            sum += a;
            a++;
        } while (a <= 100);
        System.out.println("Sum of 100 number : " + sum);
    }
}