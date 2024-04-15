// Count Negative Numbers

class Question4{
    public static void main (String[] args){

        int[][] arr = {
            {-12 , 90},
            {45, -66}
        };

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length ; j++){
                if(arr[i][j] < 0){
         
                System.out.println("Negative number found: " + arr[i][j]);
            }
        }

    }
    }
}