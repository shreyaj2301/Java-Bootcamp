//This program is used for the printing the array using loop.

class Arraydemo2{

    public static void main (String [] args){

        int[] arr1 = new int [5];
        arr1 [0] = 15;
        arr1 [1] = 52;
        arr1 [2] = 78;
        arr1 [3] = 90;
        arr1 [4] = 25;

       int  value = arr1.length;

        for(int i = 0; i < value ; i++ ){
            System.out.println(arr1[i] + " ");
        }
    }
}