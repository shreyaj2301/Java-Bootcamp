class Prime{

    public static void main (String[] args){
        
        int num = 123;
        boolean isprimeNum = isprimeNum(num);
        System.out.println(isprimeNum? "Prime number" : "Not prime number");
    }

    static boolean isprimeNum(int num){
        int count = 0 ;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        // if(count == 2){
        //     System.out.println("It is prime");
        // }
        // else{
        //     System.out.println("It is not prime");
        // }

        if(count == 2){
            return true;
        }
        else{
            return false;
        }
    }
}