class Fibonacci2{
    public static void main(String[]args){
        int n =12;
        int first =0;
        int second =1;
        int next ;
        int sum = first;
        for (  int i=1; i< n;i++)
        {
            next = first + second;
            sum =sum + next;
            first = second;
            second = next;
        }
        System.out.println(" the sum of the first"+n+"fibonacci number is :"+sum);
    }
}