//Palindrome program 

import java.util.Scanner;
class Palindrome {
      
       public static void main (String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = input.nextInt();
    int temp = num;
    int reverse = 0 ;
    
    while(num != 0){

        int digit = num %10;
        num = num /10;
        reverse = reverse * 10 + digit;

    }
        System.out.println(reverse);
    
    if(temp == reverse){
        System.out.println("The number is palindrome");
    }else{
        System.out.println("The number is not palindrome");
    }
}
}