class ID12 
{
    public static void main(String[] args) 
    {
        int m=1010, n=1010;
         
        System.out.println(m++ / ++n * n-- / --m); 
    }
}
//m++ =is1010(post increment) 1011<-new value
//++n =is 1010(pre increment) 1011<-new value
//n-- =is 1011(post decrement) 1010<-new value
//--m =is 1011(pre decrement) 1010<-new value
//m++ / ++n * n-- / --m
//1010/1011*/1011/1010=0