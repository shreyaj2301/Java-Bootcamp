

// * * * * * * 
// * * * * *
// * * * *
// * * * * * * *
// * * * * *
// * * * * * * * *
class Mixpattern2{

    public static void main (String[] args){

        int num = 654758;

        int rev = 0;
        while(num != 0){
            int digit = num % 10;
            num = num / 10;
            rev = rev * 10 + digit;
            }
        while(rev != 0){

            int digit = rev % 10;
            rev = rev / 10;
            for(int i = 0; i < digit ; i++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}