 class Assirshift{
    public static void main(String[] args) {
        int a = 15;
        int b =  10;
         int c  =  150;
        a >>= 1; // equal to a = a >> 1
        b >>= 1; // equal to b = b >> 1
        c >>= 1; // equal to c =  c  >> 1

        System.out.println("a after right shift: " + a);
         System.out.println("b after  right shift:  :" + b);
        System.out.println("c after  right shift:  " + c);
    }
}