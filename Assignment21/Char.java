class Char {
     
    public static void main (String[] args){
    char[][] arr = {
        {'A', 'B', 'C'},
        {'P', 'Q', 'R'},
        {'X', 'Y', 'Z'}
    };
    for(int i =0; i < arr.length; i++){
        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
} 
}