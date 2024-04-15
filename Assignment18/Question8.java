// Find Average: Write a program to find the average of elements in an array.

class Question8{

    public static void main (String [] args){

        int [] arr = { 11 , 12 ,13, 14 , 15};

        int sum= 0;
        int avg = 0;
        
        for(int i = 0; i < arr.length; i++){

            sum += arr[i]; 
            avg = sum / arr.length;        
        }

        System.out.println(avg);


    }
}