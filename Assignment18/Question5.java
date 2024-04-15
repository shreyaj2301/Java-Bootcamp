// Check for Duplicates: Write a program to check if an array contains any duplicate elements.

class Question5{

    public static void main (String[] args){

        int [] arr4 = { 23, 44, 44, 56};

        boolean isDuplicate = false;
         
        for(int i = 0; i < arr4.length ; i++){
            for (int j = 0; j < arr4.length; j ++){
                if(arr4[i] == arr4[j]){
                    isDuplicate = true;
                    break;
                }

            }}

             if (isDuplicate) {
            System.out.println("Array contains duplicate elements.");
        } else {
            System.out.println("Array does not contain duplicate elements.");
        }

            
        }
    }
    