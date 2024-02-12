class Typescriptchar{
    public static void main(String[]args)
    {  
        // char showing as int, short,float,double,byte,long,boolean
        char a = '6';
        char b = '2';
        System.out.println("char a and b as int -" +(int)(a+b)); // print as pretty printing
        System.out.println("char a and bas short -"+(short) (a-b));
        System.out.println("char a and b long -"+(long) (a*b));
        System.out.println("char a and b float -"+(float) (a%b));
        System.out.println("char a and b double -"+(double) (a/b));
        System.out.println("char a and b char  -" +(char)(a+b));//it showing h
       // System.out.println("char a in boolean -"+(boolean) a);

    }
}