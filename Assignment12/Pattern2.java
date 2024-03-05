// A 
// A B
// A B C
// A B C D
// A B C D E
// A B C D E F
// A B C D E F G

class Pattern2{

    public static void main (String[] args){

        for(int i = 0; i < 7; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((char)(j + 'A') + " ");
            }
            System.out.println();
        }
    }
}