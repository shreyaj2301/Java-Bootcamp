// Merge Two Sorted Arrays: Write a program to merge two sorted arrays into a single sorted array.

class Question6 {

    public static void main (String[] args){

    int [] arr1 = { 1 ,2 ,3 ,4 , 5};
    int [] arr2 = { 6,7,8,9,10};
 

    // int [] arr3 = arr1 + arr2

    for(int i = 0; i < arr1.length; i++){
        for(int j = 0; j < arr2.length; j++){
            
            int a = arr1[i] + arr2[j];
            System.out.print(a + " ");
        }
    }
    System.out.println();

}
}