 class Break2 {
    public static void main(String[] args) {
       
        for (int a = 1; a <= 20; a++) {
            if (a % 5 == 0) {
                break;
            }
            System.out.println(a);
        }
    }
}