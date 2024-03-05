class EvenOdd{

    public static void main (String[] args){

        int num = 39;
        evenOdd(num);

    }

    static void evenOdd(int num){

        if(num % 2 == 0){
            System.out.println("This is even");
        }
        else{
            System.out.println("It is odd");
        }
    }
}