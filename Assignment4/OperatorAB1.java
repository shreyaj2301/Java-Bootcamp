class OperatorAB1{
    public static void main(String[]args)
    {
        //Program using Arithmatic operator and Boolean AND operator
        // A       B       o/p
        //True    True    True
        //True    False   False
        //False   True    False
        //False   False   False
        // we using a NOT operator because the result of the expression correct and in boolean state means 5+5=10 !=(is  equal to) 0 and 
        //the expression result must in true and false value to  get the output of boolean Operator
        //to get the output of Arithmatic esxpression in boolean we have to give expression in boolean
       System.out.println((5+5 != 0) && (5-6 != 0)); // true
       System.out.println((6-2 != 0) && (10+5 != 0)); // true
       System.out.println((12*2 != 0) && (15/3 != 0)); // true
       System.out.println((5/2 != 0) && (100%10 != 0)); // false
       System.out.println((5%2 != 0) && (100/10 != 0)); // true
    } 
}