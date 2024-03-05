
//Square pattern
// column 
// 0 1 2 3 4 5     - row
// * * * * * *     - 0
// * * * * * *     - 1
// * * * * * *     - 2
// * * * * * *     - 3
// * * * * * *     - 4
// * * * * * *     - 5



class Pattern1{

    public static void main (String[] args){

        for(int i = 0 ; i < 6 ; i++){   //  outter loop it has columns.

            for(int j = 0 ; j <6 ; j++){   //inner loop it has rows.

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}