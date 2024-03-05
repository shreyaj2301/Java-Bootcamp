// A 
// B C
// D E F
// G H I J
// K L M N O
class Pattern4{

    public static void main (String[] args){
           
        int n = 5;
        int count =0;
        for(int row =0; row < n ; row++){
            for(int col = 0; col <= row ; col++){
                System.out.print((char)('A' + count++) + " ");
            }
            System.out.println();
        }
    }
}