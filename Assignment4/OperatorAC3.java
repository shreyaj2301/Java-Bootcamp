class OperatorAC3{
    public static void main(String[]args)
    {
         System.out.println((5-2)>(6-5));//true
         System.out.println((5+2)>(10-5));//true
         System.out.println((12/2)>(1+2));//true
         System.out.println((5*2)>(100/10));//false
         System.out.println((5%2)>(100/10));//false 5%2 is 1 is not greater than 100/10 is 10 
    } 
}