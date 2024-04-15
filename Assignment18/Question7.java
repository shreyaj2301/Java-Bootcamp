// Count Even and Odd Numbers: Write a program to count the number of even and odd numbers in an array.


class Question7{

    public static void main (String[] args){

        int[] arr = { 1 ,2 ,3 ,4,5,6,7,8,9};
        int evencount = 0;
        int oddcount = 0;

        for(int i =0; i < arr.length; i++){
            if(arr[i]% 2 == 0){
                evencount++;
            } else{
                oddcount++;

            }
        }
        System.out.println("The number of even is " + evencount);
        System.out.println("The number of odd number is :" + oddcount);
    }
}