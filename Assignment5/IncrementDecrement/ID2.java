public class ID2

{
    public static void main(String[] args) 
    {
        int a=11, b=22, c;
         
        c = a + b + a++ + b++ + ++a + ++b;
         
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}
//a=11, b=22
//a++ =a is 11 (post increment) 12<- new value 
//b++ =b is 22 (post increment) 23<- new value
//++a  =a is 12 (pre increment) 13<-new value
// ++b = bis 23 (preincrement)  24<- new value
//  c = a + b + a++ + b++ + ++a + ++b; is 
//  c= 11 + 22 + 11 + 22  + 13  + 24
//  c=103 a =13 and b =24