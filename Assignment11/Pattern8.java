//        *
//       ***
//      *****
//     *******
//    *********
class Pattern8{

    public static void main (String[] args){
  int n= 10;

        for(int i = 0; i < n ; i++){

           for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < i ; j++){
                if(i % 2 != 0){                    
                    System.out.print("* ");
                }
                 }
            
            System.out.println();
        }
        }
    }

