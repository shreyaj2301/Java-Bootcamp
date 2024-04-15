// Sum of Array Elements: Write a program to calculate the sum of all elements in an array.

class Question2{

    public static void main (String[] args){

        int[] arr1 = { 1 , 2, 3, 4 ,5 };
        
        int sum = 0;
        for(int i = 0; i < arr1.length ; i++){
            sum += arr1[i];
        }
        
        System.out.print(sum);
    }
}