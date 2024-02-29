// nth number of fibonacci series
class Fibonacci1{
    public static void main(String[]args){
        int n =11;
        int first = 0;
        int second =1;
        int next;
         
         for (int i =0; i < n - 1; i++)
         {
            next = first + second;
            first = second;
            second = next ;

         }
         System.out.println("the "+n+"th number in the fibonacci is :"+first);
    }
}