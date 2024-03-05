

// G F E D C B A 1 2 3 4 5 6 7 
// G F E D C B     2 3 4 5 6 7 
// G F E D C         3 4 5 6 7 
// G F E D             4 5 6 7 
// G F E                 5 6 7
// G F                     6 7
// G                         7
class Mixpattern1{

    public static void main (String[] args){


        for(int i = 0; i < 7; i++){

            int count = 1;

            for(int j= 0; j < 7 -i; j++){

                System.out.print((char)('A' + 7 - j - 1) + " ");
            }

            for(int j = 0; j < i * 2 ; j++){
                System.out.print("  ");
            }

            for(int j = 0; j < 7 - i; j++){

                System.out.print(i + count++ + " ");
            }

            System.out.println();
        }
    }
}