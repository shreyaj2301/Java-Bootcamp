// Calculate the Sum of All Elements

class Question1{

    public static void main (String [] args){

        int [][] arr1 = {
            {1 ,2,},
            {3,4}
        };
        int[][] arr2 = {
            {5 ,6 },
            {7,8}
        };
        int [][] ans = new int [2][2];
        
        for(int i =0; i < arr1.length; i++){
            for(int j = 0; j < arr1.length;j++){
                ans[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(ans[i][j] + " ");
                
              
            }
            System.out.println();
        }
    }
}