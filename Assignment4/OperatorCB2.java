class OperatorCB2{
    public static void main(String[]args)
    { 
        //Program using a camparision and boolean OR operator
      //  A       B       o/p
      //  True    True    True
      //  True    False   True
      //  False   True    True
      //  False   False   False


         System.out.println((5==5)||(5<6));//true
         System.out.println((5>=2)||(10>5));//true
         System.out.println((12>2)||(1<=2));//true
         System.out.println((5<=2)||(100>=10));//true
         System.out.println((5<2)||(100==10));//false 
    } 
}