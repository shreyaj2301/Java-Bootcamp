class OperatorCB1{
    public static void main(String[]args)
    {
        //Program using camparision operator and Boolean AND operator
        // A       B       o/p
        //True    True    True
        //True    False   False
        //False   True    False
        //False   False   False

         System.out.println((5==5)&&(5<6));//true
         System.out.println((5>=2)&&(10>5));//true
         System.out.println((12>2)&&(1<=2));//true
         System.out.println((5<=2)&&(100>=10));//false
         System.out.println((5<2)&&(100==10));//false 
    } 
}