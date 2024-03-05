// G F E D C B A 
// G F E D C B
// G F E D C
// G F E D
// G F E
// G F
// G

class Pattern1{

    public static void main (String[] args){

        for(int i = 0; i < 7 ; i++){
            for(int j = 0; j < 7 -i ; j++){
                System.out.print((char)('A' + 7 - j - 1) + " ");
            }
            System.out.println();
        }
    }
}