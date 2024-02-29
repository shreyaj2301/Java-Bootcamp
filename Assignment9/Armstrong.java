//Program of armstrong
class Armstrong{

    public static void main (String[] args){

        int num = 78;
        int temp = num;
        int sum = 0;

        while(num!=0){

            int digit = num %10;
            num = num /10;
            sum = sum + (digit* digit * digit);
        }
        System.out.println(sum);

        if(sum == temp) System.out.println("The number is armstrong");
        else System.out.println("The number is not armstrong");
    }
}