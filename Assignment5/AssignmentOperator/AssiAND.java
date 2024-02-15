 class AssiAND{
    public static void main(String[] args) {
        int a = 15;
        int b =  10;
         int c  =  150;
        a &= 3; // equal to a = a & 3
        b &= 5; // equal to b = b & 5
        c &= 10; // equal to c = c  & 10

        System.out.println("a after bitwise AND: " + a);
         System.out.println("b afterbitwise AND:" + b);
        System.out.println("c after bitwise AND: " + c);
    }
}