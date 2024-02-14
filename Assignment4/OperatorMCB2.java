class OperatorMCB2{
    public static void main(String[]args)
   {
           System.out.println((5 == 5 || 5 > 16) || (5 < 6 || 6 >= 4)); // true
           System.out.println((5 >= 2 || 2 < 20) || (10 > 5 || 5 <= 9)); // true
            System.out.println((12 > 2 || 2 <= 8) || (1 <= 2 || 2 == 10)); // true
            System.out.println((5 <= 12 || 12 == 12) || (100 >= 10 || 10 < 60)); // true
            System.out.println((5 < 2 || 2 >= 7) || (100 == 10 || 10 > 25)); // false
   

    } 
}