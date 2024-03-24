class Swapnum {
   
    public static void main (String[] args){

        //Method -1 
        int a = 12;
        int b = 23;
        int temp = a;
        a = b;
        b = temp;
        System.out.println( "Swapped value of a :" + a);
        System.out.println("Swapped value of b : " +b);


        //Method - 2
        int c= 10;
        int d = 5;

        c = c + d;
        d = c - d;
        c = c - d ;

        System.out.println("Swapped value of c :" +c);
        System.out.println("Swapped value of d :" +d);

        //Method - 3
        int e = 90;
        int f = 23;

        e = e * f;
        f = e / f;
        e = e/ f;
        System.out.println("Swapped value of e :" +e);
        System.out.println("Swapped value of f :" +f);


    }
}