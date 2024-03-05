// 11111
// 2222
// 333
// 44
// 5

class Pattern6{

    public static void main (String[] args){

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5 -i ; j++){
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}