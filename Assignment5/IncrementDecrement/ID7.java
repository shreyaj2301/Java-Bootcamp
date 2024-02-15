class ID7
{
    public static void main(String[] args) 
    {
        int i=19, j=29, k;
         
        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
         
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
    }
}
//i-- =is 19 (post decrement) 18<-new value
//i++ =is 18(post increment)  19 <-new value
//--j = is 29(pre decrement) 28<- new value
//--i =is 19(pre decrement)  18<-new value
//j-- =is 29(post decrement)  28<-new value
//++i =is 18(pre increment)  19<-new value
//j++ =is 28(post increment)  29<-new value
//k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
//k=19-18+28-29+18-29+19-28=-20       
    