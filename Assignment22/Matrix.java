import java.util.Arrays;
import java.util.Scanner;
class Matrix {
    

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int size = input.nextInt();
        int[] arr = new int[size];
      
        System.out.println("Enter the value :");      
        for(int i = 0 ; i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}