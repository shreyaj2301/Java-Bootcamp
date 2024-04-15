class Double {
    
    public static void main (String[] args){

        double[][] arr = {
            {123345, 24567},
            {8654566, 346977}
        };
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}