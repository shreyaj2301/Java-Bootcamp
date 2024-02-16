class Dowhile4 {
    public static void main(String[] args) {
        int Multiplication = 1; 
        int a = 1;
        do {
            Multiplication *= a;
            a++;
        } while (a <= 5);
        System.out.println("Multiplication of numbers from 1 to 5: " + Multiplication);
    }
}