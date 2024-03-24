class Arraydemo9
{

    public static void main (String[] args){

        short[] arr5 = { 12, 56, 44, 66, 45};

        for(int num : arr5){
            if ( num < 50){
                System.out.print(num + " ");
            }
        }
    }
}