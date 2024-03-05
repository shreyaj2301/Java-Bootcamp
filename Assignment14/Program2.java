class Program2{

    public static void main (String[] aegs){
       isPattern();
       isPatternRange(0,5);
    }
    static void isPattern(){
        for(int i = 0 ; i < 5; i++){
            for(int j = 0 ; j < 5 - i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void isPatternRange(int start, int end){
        for(int i = start; i < end;i++){
            isPattern();
            System.out.println(i);
        }
    }
}