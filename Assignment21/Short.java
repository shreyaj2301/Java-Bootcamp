class Short{

    public static void main (String[] args){

        short[][] arr = new short[3][3];
        
        arr[0][0]= 151;
        arr[0][1]= 152;
        arr[0][2]= 153;

        arr[1][0]= 154;
        arr[1][1]= 155;
        arr[1][2]= 156;

        arr[2][0]= 157;
        arr[2][1]= 158;
        arr[2][2]= 159;

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}