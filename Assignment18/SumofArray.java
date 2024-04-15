class SumofArray{

    public static void main (String[] args){

        int [] arr = { 100 , 200 , 300, 400};

        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        System.out.print(sum);

    }
}