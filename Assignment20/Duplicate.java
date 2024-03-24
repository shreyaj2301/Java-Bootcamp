class Duplicate {

    public static void main (String[] args){
        int [] arr = { 2 , 4 ,5 ,5, 7,8};
        System.out.println(checkDuplicate(arr));

    }
    static boolean checkDuplicate(int[] arr){

        for(int i = 0; i < arr.length ; i++){
            int currentElement = arr[i];
            boolean isDuplicate = linearSearch(arr, i + 1 , currentElement);
            if(isDuplicate){
                return true;
            }
        }
        return false;
    }
    static boolean linearSearch(int[] arr , int startIndex, int search){
        for(int i = startIndex; i < arr.length; i++){
            if(arr[i] == search){
                return true;
            }
        }
        return false;

    }
}