class Arraydemo6{

    public static void main (String[] args){

        int[] i = {13 ,123 , 127,-58,-92};
        
        for(int num : i){
         if (num >= 50){
            System.out.print(num + " ");
         }else{
            System.out.print("");
         }}

         
        // while (i > 50){
        //     System.out.print(i);
        //     i ++;
        // }
        // Even if you fix the loop condition, the increment operation i++ is incorrect because i is an array, 
        // not a single integer variable. You need to iterate over the array indices or use an enhanced for loop to access each element.



        // do {
        //     System.out.print(i);
        //     i++;
        // }
        // while(i > 50);
        // error: bad operand type int[] for unary operator '++'
        //     i++;
        //      ^
        //  Program3.java:11: error: bad operand types for binary operator '>'
        // while(i > 50);
        //         ^
        //  first type:  int[]
        // second type: int
        // 2 errors
    }
}