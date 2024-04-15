class PrimeNumber{

    public static void main (String[] args){
      
        primeNumber();

    }
    static void primeNumber(){
        int [] arr = { 1,2,3,4,5,6,7,8,9,0};
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 ){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();


    }
}