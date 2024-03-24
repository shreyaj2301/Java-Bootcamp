class Primenum{

    public static void main (String[] args){
        // int num = 13;
        // boolean isPrimeNumber = isPrimeNumber(num);
        // System.out.println(isPrimeNumber);
        isPrimeNumberRange(0,20);
    }

    static boolean isPrimeNumber(int num){
        int count = 0;
        for(int i =1 ; i <= num ; i++){
            if(num % i == 0){
                count ++;
            }
        }
        if(count == 2) {
            return true;
        }else{
            return false;
        }}
        static void isPrimeNumberRange(int start , int end){
             for(int i = start ;i<= end;i++){
                boolean isPrimeNumber = isPrimeNumber(i);
                System.out.print(i + " "+ (isPrimeNumber ? "is prime number" : "is not prime number")+"\n");
             }
        }      
        

}