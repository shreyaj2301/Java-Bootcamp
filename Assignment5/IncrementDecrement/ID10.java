 class ID10{
    public static void main(String[] args) 
    {
        int a=1;
         
        a = a++ + ++a * --a - a--;
         
        System.out.println(a);
    }
}
//a++ =is 1(post increment) 2<-new value
//++a =is 2(pre uncrement) 3<-new value
//--a =is2(pre increment) 1<-new value
//a--=is 3 (post decrement)2<-new3value
//   a = a++ + ++a * --a - a--;
//a= 1+3*2-2=5
