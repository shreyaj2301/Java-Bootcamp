// Find Maximum Element: Write a program to find the maximum element in an array.

class Question3 {

    public static void main (String[] args){

        int [] arr2 =  { 12, 45, 66, 7, 87 ,99};

        int max = arr2[0];
        for(int i = 1; i < arr2.length; i++){
            if(arr2[i] > max)
            max = arr2[i];
            
        }
                System.out.print("The largest array : " + max);
            
    }
}