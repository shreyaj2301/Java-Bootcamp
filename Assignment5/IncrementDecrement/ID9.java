 class ID9
{
    public static void main(String[] args) 
    {
        int m = 0, n = 0;
         
        int p = --m * --n * n-- * m--;
         
        System.out.println(p);
    }
}
//--m =is 0(pre decrement)-1<-new value
//--n=is 0(pre decrement)-1<-is new value
//n--=is -1(post decrement)-2<- new value
//m--=is -1(post decrement)-2<-new value
//p = --m * --n * n-- * m--;
//p= -1*-1*-1*-1=1
