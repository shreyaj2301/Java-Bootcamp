class Typescriptlong{
    public static void main(String[]args)
    {  
        // long  showing as int, short,float,double,char,byte,boolean
        long a = 600000L;
        long b = 233333L;
        System.out.println("long a and b as int -" +(int)(a+b)); // print as pretty printing
        System.out.println("long a and bas short -"+(short) (a-b));
        System.out.println("long a and b byte-"+(byte) (a*b));
        System.out.println("long a and b float -"+(float) (a%b));
        System.out.println("long a and b double -"+(double) (a/b));
        System.out.println("long a and b char  -" +(char)(a+b));// it showing question mark
      //  System.out.println("long a in boolean -"+(boolean) a);

    }
}