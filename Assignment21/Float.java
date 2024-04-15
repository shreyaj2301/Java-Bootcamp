import java.util.Arrays;
class Float{

    public static void main (String[] args){
       
        float [][] arr = {
            {1.1f, 1.2f , 1.3f},
            {1.4f , 1.5f , 1.6f},
            {1.7f , 1.8f , 1.9f}
        };
         
        System.out.print(Arrays.toString(arr[1]));
        // for(int i =0; i < arr.length; i++){
        //     for(int j = 0; j < arr.length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}