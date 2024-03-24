//Using for loop print the array reverse format

import java.util.Arrays;

class ReverseLoop{

    public static void main (String[] args){
        int[] arr = {10 , 20 , 30 , 40 , 50 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
      
    }
    static void reverse(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1- i];
            arr[arr.length - 1- i] = temp;
        }
    }
}