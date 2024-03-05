
//Square pattern
// column 
// 01234     - row
// *****      - 0
// *****      - 1
// *****      - 2
// *****      - 3
// *****      - 4




class Pattern1{

    public static void main (String[] args){

        for(int i = 0 ; i < 5 ; i++){   //  outter loop it has columns.

            for(int j = 0 ; j <6 ; j++){   //inner loop it has rows.

                System.out.print("*");
            }
            System.out.println();
        }
    }
}