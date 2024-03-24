class Program {

    public static void main (String[] args){
        // int num = 96;
        // boolean isEvenOdd = isEvenOdd(num);
        // System.out.println(isEvenOdd ? "Odd number" : "Even number");
        isEvenOddRange(0,20);
    }

    static boolean isEvenOdd(int num){
        // return num % 2 != 0;
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    static void isEvenOddRange(int start , int end){
        for(int i = start; i <= end; i++){
            boolean isEven = isEvenOdd(i);
            System.out.print(i + " is " + (isEven ? "Even" : "Odd") + "\n");
        }
    }
}