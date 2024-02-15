 class ID6
{
    public static void main(String[] args) 
    {
        int a=1, b=2;
         
        System.out.println(--b - ++a + ++b - --a);
    }
}
//--b =is 2 (pre decrement) 1<-new value
//++a =is 1(pre increment)  2 <-new value
//++b = is 1(pre increment) 2<- new value
//--a =is 2(pre increment)  1<-new value
//so --b - ++a + ++b - --a
//    1-2+2-1=0