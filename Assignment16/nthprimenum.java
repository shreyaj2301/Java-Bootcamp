class nthprimenum{
    // 2  3  5  7 11  13  17  19  23  29  31  37  41  -> prime number
    // 1  2  3  4  5  6   7   8   9   10  11  12  13  14

    public static void main (String[] args){
     
     int num = 5;
    //  System.out.println(isPrime(num));
     nth_prime_number(num);

    }

    static void  nth_prime_number(int num){
        int count = 1;
        int i = 0;
        while(num + 1 != count){
            boolean isPrime = isPrime(i);
            if(isPrime) count++;
            i++;
        }
        System.out.println(i - 1);
    }

    static boolean isPrime(int num){
        int count = 0;
        for(int i = 1; i <= num ; i++){
            if(num % i == 0)count++;
        }
        if(count == 2) return true;
        else return false;
    }
}