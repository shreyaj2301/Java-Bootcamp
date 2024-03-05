

// right angle triangle 

// 0 1 2 3 4 5 <-colume
// *            -> i= 0 = i + 1 -> row
// * *          -> i= 1 = i + 1 
// * * *        -> i= 2 = i + 1 
// * * * *      -> i= 3 = i + 1 
// * * * * *    -> i= 4 = i + 1 
// * * * * * *  -> i= 5 = i + 1 
class Pattern2{

    public static void main (String[] args){

        for (int i = 0; i < 6 ; i++){

            for(int j =0 ; j < i + 1 ; j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}