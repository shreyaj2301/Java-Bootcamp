class ReverseNumber {

    public static void main (String[] args){

        int[] arr = {5 , 4 , 3 , 2 , 1};

        for(int i = 0 ; i < 5 ; i++){
            System.out.print(arr [i] + " ");
        }
        System.out.println();

        for(int i = 5 -1 ; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
    }
}