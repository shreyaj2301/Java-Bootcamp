import java.util.Arrays;
class Target{

    public static void main (String[] args){

        int[] arr = {10, 24 , 3 , 40 , 50};
        int target = 50;
        int[] ans = new int[2];

        for(int i = 0 ; i < arr.length; i++){
            int currentElement = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                int sum = currentElement + arr[j];
                if(sum == target){
                    ans[0] =i;
                    ans[1] = j;
                    // System.out.println(i);
                    // System.out.println(j);
                }
            }
        }
  System.out.println(Arrays.toString(ans));

    }
}