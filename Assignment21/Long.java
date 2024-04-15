class Long{

    public static void main(String[] args){

        long[][] arr = {
            {10 , 20 , 30},
            {40, 50 , 60},
            {70 , 80 , 100}
        };
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}