 class ID19
{
    public static void main(String[] args) 
    {
        int i = 0, j = 0;
         
        System.out.println(--i * i++ * ++j * j++);
    }
}
//--i =is 0(pre decrement)-1<-new value
//i++=is -1(post increment)1<-new value
//++j=is 0(pre increment)1<-newvalue
//j++=is 1(post increment)2<-new value
//--i * i++ * ++j * j++
//0*1*1*1=1
