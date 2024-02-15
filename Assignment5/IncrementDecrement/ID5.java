 class ID5
{
    public static void main(String[] args) 
    {
        int i=1, j=2, k=3;
         
        int m = i-- - j-- - k--;
         
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
        System.out.println("m="+m);
    }
}
 // i-- =i is 1 (post decrement) 0<- is new value
 //j-- = j is 2(post decrement)  1<-is new value
 //k-- =k is 3(post decrement)   2<-new value
 //m=i-- - j-- - k--
 //m= 1-2-3=-4