class LinearSearch {

    public static void main (String[] args){

        int [] arr = { 10, 40 , 56, 78, 23};
        System.out.println(linearSearch1(arr, 78));
    }
    static boolean linerSearch(int[] arr , int search){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                return true;
            }
        }
        return false;

    }

    static int linearSearch1 (int[] arr, int search){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr [i] == search){
                return i;
            }
        }
    return -1;
    }
}