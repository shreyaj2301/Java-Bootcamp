class Pattern7{

    public static void main (String [] args){

        for(int i = 0; i < 7; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
            for(int a = 0; a < 7; a++){
            for(int k = 0; k < 7 - a; k++){
                System.out.print(" * ");
            }
            System.out.println();
        
    }}
}