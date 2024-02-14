class OperatorAC2{
    public static void main(String[]args)
    {
         System.out.println((5-2)<(6-3));//false
         System.out.println((5+2)<(10-5));//false
         System.out.println((12/6)<(1+1));//false
         System.out.println((5*2)<(100/10));//false
         System.out.println((5%2)<(100/10));//true 5%2 is 1 is less than 100/10 is 10 
    } 
}