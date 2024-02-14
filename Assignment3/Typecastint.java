class Typecastint{
    public static void main(String[]args)
    {  
        // int  showing as byte, short,float,double,char,boolean,long
        int a = 10;
        int b = 23;
        System.out.println("int a and b as byte -" +(byte)(a+b)); // print as pretty printing
        System.out.println("int a and b as short -"+(short) (a-b));
        System.out.println("int a and b as long -"+(long) (a*b));
        System.out.println("int a and b as float -"+(float) (a%b));
        System.out.println("int a and b as double -"+(double) (a/b));
        System.out.println("int a and b as char  -" +(char)(a+b));// it showing a (!)
      //  System.out.println("int a in boolean -"+(boolean) a);

    }
}