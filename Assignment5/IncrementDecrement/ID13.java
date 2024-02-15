 class ID13
{
    public static void main(String[] args) 
    {
        int x = 001, y=010, z=100;
         
        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
         
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("i="+i);
    }
}

// solution :
// --x = is001(pre decrement)-0<-new value
// y++ = is 010(post increment)11<-is new value
// z-- = is 100(post decrement)99<-is new value
// --z = is 99(pre decrement) 98<-is new value
// ++y = is 11(pre increment) 12<-new value
// --x = is o(pre decrement) -1<-is new value
// y-- = is 12 (post decrement) 11<-new value
// --x = is -1(pre decrement) -2 <-new value
//  i =  --x + y++ - z-- - --z + ++y - --x + y-- - --x;
//  0 + 10 – 100 – 98 + 12 – (-1) + 12 – (-2)
//  -167