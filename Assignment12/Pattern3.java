// A 
// B B
// C C C
// D D D D
// E E E E E
// F F F F F F
// G G G G G G G

class Pattern3{

    public static void main (String[] args){

        for(int i = 0; i < 7; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((char)(i+ 'A') + " ");
            }
            System.out.println();
        }
    }
}