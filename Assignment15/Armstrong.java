class Armstrong{
    public static void main (String[] args){ 

        // boolean isarmStrong = isarmStrong(153);
        // System.out.println(isarmStrong);
        armStrongRange(0,1000);

    }

    static boolean isarmStrong(int num){
         int sum = 0;
         int temp = num;
         while(num != 0){
            int digit = num % 10 ;
            num = num /10 ;
            sum = sum + (digit * digit * digit);
         }
         if(sum == temp) return true;
         else return false;
    }

    static void armStrongRange(int s, int e){
        for(int i = s ; i <= e; i++){
            boolean isarmStrong = isarmStrong(i);
            System.out.print(isarmStrong ? i + " " : "");
        }
    }
}
