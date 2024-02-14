class Typecastbyte{
    public static void main(String[]args)
    {  
        // byte  showing as int, short,float,double,char,long,boolean
        byte a = 60;
        byte b = 23;
        System.out.println("byte a and b as int -" +(int)(a+b)); // print as pretty printing
        System.out.println("byte a and b as short -"+(short) (a-b));
        System.out.println("byte a and b as long -"+(long) (a*b));
        System.out.println("byte a and b as float -"+(float) (a%b));
        System.out.println("byte a and b as double -"+(double) (a/b));
        System.out.println("byte a and b as char  -" +(char)(a+b));// it showing S
       // System.out.println("byte a in boolean -"+(boolean) a);

    }
}