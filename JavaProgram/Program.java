class Program{
    public static void main (String[]args){
        int num = 12321;
        int num2= num;
        int reverse =0;
        while (num!=0){
            int result =num %10;
            num =num /10;
            reverse =reverse* 10+ result;
        }
        if(reverse==num2)System.out.println("it is palindrome number");
        else System.out.println("it is not palindrome");
        
    }
  

}