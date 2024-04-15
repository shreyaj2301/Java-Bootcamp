class Boolean{

    public static void main (String[] args){

        boolean [][] arr= {
            {true , false},
            {false,true}
        };
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}