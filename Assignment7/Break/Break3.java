class Break3{
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        do {
            if (b % 2 == 0) { 
                a += b; 
                break; 
            }
            b++;
        } while (b <= 40);
        System.out.println("Sum of even numbers : " + a);
    }
}

