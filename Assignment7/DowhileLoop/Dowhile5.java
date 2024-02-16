 class Dowhile5 {
    public static void main(String[] args) {
        int a = 0; 
        int b = 1;
        do {
            if (b % 2 == 0) { 
                a += b; 
            }
            b++;
        } while (b <= 10);
        System.out.println("Sum of even numbers from 1 to 10: " + a);
    }
}