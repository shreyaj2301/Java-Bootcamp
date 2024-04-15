// Find the Maximum Element

class Question2{
    public static void main (String[] args){

        int[][] arr1 = {
            { 10 ,20},
            {30,40}
        };
        int[] [] arr2 = {
            {50,60},
            {70,80}
        };

        int max = arr1 [0][0];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1.length ; j++)
            if(arr1[i][j] > max)
            max = arr1[i][j];
            
        }
            System.out.print("The largest number in  array one is  : " + max);
            System.out.println();

            int max2 = arr2 [0][0];
            for(int i = 0; i < arr2.length; i++){
                for(int j = 0; j < arr2.length ; j++)
                if(arr2[i][j] > max2)
                max2 = arr2[i][j];
                
            }
                System.out.print("The largest number in second array is  : " + max2);
        
    
    }
}