class NegativeNumber{

    public static void main (String[] args){

        int[] arr = { 12 , -34, 55 , -5, 56};
        
        for(int i = 0; i < arr.length ; i++){
            if(arr[i]< 0){
                System.out.print(arr[i] + " ");
            }
            
        }
        System.out.println();

    }
}