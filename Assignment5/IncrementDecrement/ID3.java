 class ID3
{
    public static void main(String[] args) 
    {
        int i=0;
         
        i = i++ - --i + ++i - i--;
         
        System.out.println(i);  
    }
}


//i++ = i is 0(post increment) 1<-new value
//--i = i is 1(pre decrement)  0<-new value
//++1 = i is 1(pre increment)  1<-new value
// so i=  0-0+1-1=0